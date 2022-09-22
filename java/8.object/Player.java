import java.util.Random;
public class Player{

  private String name;
  private JankenStrategy strategy = new RandomStrategy();

  public Player(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public JankenStrategy getStrategy(){
    return this.strategy;
  }

  public void setStrategy(JankenStrategy strategy){
    this.strategy = strategy;
  }

  public void prevHands(JankenHand myHand, JankenHand opponentHand){
    strategy.prevHands(myHand,opponentHand);
  }

  public JankenHand nextHand(){
    return strategy.nextHand();
  }

}
