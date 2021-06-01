import java.util.Scanner;
import java.util.Random;

/*

A number-guessing game.

*/ 
//need to get random number from 1-100
//while loop 
//need to ask user for their guess and get back their input
//conditionals to handle their guess
//tracker to keep track of the number of guesses
//if too high, or too low relay message letting the user know
//if correct number found number and how many guesses 

public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello what is your name?");
    String name = input.nextLine();

    System.out.println("Nice to meet you " + name +", guess a number 1-100");
    
    Random rand = new Random();
    int number = rand.nextInt(100);

    int guessNumber = input.nextInt();

    while (guessNumber != number){

      if (guessNumber == number);
        System.out.println("Correct guess, you win!");
        break;
      if (guessNumber >  number );
        System.out.println("Your guess is too high, try again.");


      }
    
}
}

