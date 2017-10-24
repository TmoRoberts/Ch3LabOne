
import java.util.Scanner;
import java.util.Random;
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
          int totalGuesses;         //Number of guesses
          int lowGuesses;           //Number of low guesses
          int highGuesses;          //Number of high guesses
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          numToGuess = generator.nextInt(11);//randomly generate the  number to guess
 
          System.out.println("Enter your guess!");//print message asking user to enter a guess
 
          guess = scan.nextInt(); //read in guess
          totalGuesses = 1; 
          lowGuesses = 0;
          highGuesses = 0;
          while ( guess != numToGuess )  //keep going as long as the guess is wrong
            {
                  System.out.println("Too bad. Guess again!"); //print message saying guess is wrong
                  if (guess > numToGuess) { //Gives hint to user
                      System.out.println("Hint: Your guess is too high.");
                      highGuesses++;
                  }
                  else {
                      System.out.println("Hint: Your guess is too low.");
                      lowGuesses++;
                  }
                  guess = scan.nextInt(); //get another guess from the user
                  totalGuesses++; //Increments number of guesses from user
                  
          }
 
          System.out.println("You are correct. Congratulations!");//print message saying guess is right
          System.out.println("Total number of guesses: " + totalGuesses);//prints number of guesses
          System.out.println("High Guesses: " + highGuesses);//prints high guesses
          System.out.println("Low Guesses: " + lowGuesses);//prints low guesses
        }
}