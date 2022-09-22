import java.util.Random;

public interface JankenStrategy{

  public default void prevHands(JankenHand myHand, JankenHand opponentHand){}

  public JankenHand nextHand();
}

class RandomStrategy implements JankenStrategy{
  private Random randam = new Random();

  public JankenHand nextHand(){
    int n = randam.nextInt(3);
    return JankenHand.fromInt(n);
  }
}

class FixedHandStrategy implements JankenStrategy{

  private JankenHand hand;

  public FixedHandStrategy(JankenHand hand){
    this.hand = hand;
  }

  public JankenHand nextHand(){
    return this.hand;
  }
}
class ChottoKashikoiStrategy implements JankenStrategy{

  private JankenHand prevMyHand;
  private JankenHand prevOpponentHand;

  @Override
  public void prevHands(JankenHand myHand, JankenHand opponentHand){
    prevMyHand = myHand;
    prevOpponentHand = opponentHand;
  }

  public JankenHand nextHand(){
    //RandomStrategy流用
    if(prevMyHand == null || prevOpponentHand == null){
      return new RandomStrategy().nextHand();
    }
    if(prevMyHand.winTo(prevOpponentHand)){
      return JankenHand.fromInt(prevMyHand.ordinal() + 1);
    }else if (prevMyHand.loseTo(prevOpponentHand)) {
      return prevOpponentHand;
    }else{
      return prevMyHand;
    }
  }
}
