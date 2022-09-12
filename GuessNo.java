import java.util.Random;
import  java.util.Scanner;
class Game{
    Random random=new Random();
    Scanner sf=new Scanner(System.in);
    int no;
    int guessNo;
    int noOfGuess=0;
    Game(){
        no=random.nextInt(100);
    }
    void  userInput(){
        System.out.print("Enter The Guess :");
        guessNo=sf.nextInt();
    }
    void isCorrectNo(){
        while (noOfGuess!=10){
            userInput();
             if (guessNo==no){
                 noOfGuess++;
                System.out.println("You Guessed right");
                System.out.println("Winner You Guessed Right..No Of Guess:"+(noOfGuess));
                 break;
            } else if (guessNo>no) {
                System.out.println("Guessed No is Greater");
                 noOfGuess++;
            } else if (guessNo<no) {
                System.out.println("Guessed No is Smaller");
                 noOfGuess++;
            }
            else {

                System.out.println("Game Over!");
            }
//            System.out.println(no);
            System.out.println("Guess Left "+ (10-noOfGuess) );

         }
    }

}

public class GuessNo {
    public static void main(String[] args) {
        Game dhaval=new Game();
//        dhaval.userInput();
        dhaval.isCorrectNo();
        System.out.println(dhaval.no);
    }


}
