public class QuizeGame{
  public static void main(Sting[] args){
    char answer = A;
    char userInput = TextIO.getInChar();
    char userAnswer = userInput;
    if(userAnswer == answer){
      System.out.println("Correct");
      }
    else{
      System.out.println("Wrong, try again!");
    }
}
}
