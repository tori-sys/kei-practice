public enum JankenHand{
  Rock,
  Scissors,
  Paper;

  @Override
  public String toString(){
    switch (this) {
      case Rock: return "✊";
      case Scissors: return "✌️";
        case Paper: return "✋";
    }
    throw new IllegalStateException();
  }

  public static JankenHand fromInt(int n){
    switch(n % 3){
      case 0: return JankenHand.Rock;
      case 1: return JankenHand.Scissors;
      case 2: return JankenHand.Paper;
    }
    throw new IllegalStateException(Integer.toString(n));
  }

  public boolean winTo(JankenHand hand){
    switch (this) {
      case Rock: return hand == Scissors;
      case Scissors: return hand == Paper;
      case Paper: return hand == Rock;
    }
    throw new IllegalStateException();
  }

  public boolean loseTo(JankenHand hand){
    return this != hand && !winTo(hand);
  }
}
