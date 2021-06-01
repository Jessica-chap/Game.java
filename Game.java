import java.util.Scanner;
import java.util.Random;

/*

A number-guessing game.

*/ 
//declare class Main

//can call the class Game newGame = new Game()


public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello what is your name?");
    String name = input.nextLine();

    System.out.println("Nice to meet you " + name );
    
    Boolean playAgain = true;
    int rounds = 0;
    int bestGuesses = 100000;

//main game
    while (playAgain == true){

      Random rand = new Random();
      int number = rand.nextInt(100);

      System.out.println(number);

      System.out.println("Guess a number 1-100");
      int guessNumber = input.nextInt();

      int guessTracker = 0;

        
      while (true) {

        rounds = rounds + 1;

        if (guessNumber > 100  | guessNumber < 1){
          System.out.println("Guess within range 1-100");
          guessNumber = input.nextInt();
        }

        else if (guessNumber >  number ){
          System.out.println("Your guess is too high, try again.");
          guessTracker += 1;
          System.out.println("Guess a number 1-100");
          guessNumber = input.nextInt();
          }
          
        else if (guessNumber <  number ){
          System.out.println("Your guess is too low, try again.");
          guessTracker += 1;
          System.out.println("Guess a number 1-100");
          guessNumber = input.nextInt();}

        else if (guessNumber == number){
          guessTracker += 1;
          System.out.println("Correct guess, you win! Only took "+ guessTracker + " tries!");
          if (guessTracker < bestGuesses){
            bestGuesses = guessTracker;
            System.out.println("Your best score is now " + bestGuesses);
          }
          else {
            System.out.println("Your number of guesses was not less than your best guess of " + bestGuesses);
          }
          break;
  
          // playAgain.equals(newGame);
            // break;
        


      }
      System.out.println("Would you like to play again Yes or No?");
      String newGame = input.next();
      if (newGame.equals("No")){
        playAgain = false;
        System.out.println("Thanks for playing " + rounds + " rounds");
        // break;
      }
      //  else{
      //   rounds += 1;
      //   System.out.println(rounds);
      // }
          

    }
    
  }
  }
}



