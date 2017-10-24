// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        System.out.print("Enter your play (R, P, or S): ");
        personPlay = scan.next(); //Get player's play -- note that this is stored as a string
        personPlay.toUpperCase();//Make player's play uppercase for ease of comparison
        computerInt = generator.nextInt(3);//Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string
        if (computerInt == 0) {
            computerPlay = "R";
        }
        else if (computerInt == 1) {
            computerPlay = "P";
        }
        else {
            computerPlay = "S";
        }
        System.out.println("Computer Played: " + computerPlay); //Print computer's play
        //See who won.
        if (!computerPlay.equals(personPlay)) {
            if (personPlay.equals("R")) {
                if (computerPlay.equals("S")) {
                    System.out.print("You Win!");
                }
                else if (computerPlay.equals("P")) {
                    System.out.print("You Lose!");
                }
            }
            else if (personPlay.equals("P")) {
                if (computerPlay.equals("R")) {
                    System.out.print("You Win!");
                }
                else if (computerPlay.equals("S")) {
                    System.out.print("You Lose!");
                }
            }
            else {
                if (computerPlay.equals("P")) {
                    System.out.print("You Win!");
                }
                else if (computerPlay.equals("R")) {
                    System.out.print("You Lose!");
                }
            }
        }
        else {
            System.out.print("It's a Tie!");
        }
    }
}