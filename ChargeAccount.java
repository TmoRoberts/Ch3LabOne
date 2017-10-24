// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousBalance;  //previous balance
           double newBalance; //new balance
           double minimumPay; //minimum payment
           double additionalCharges; //charges this month
           double interest; // amount of interest
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the previous balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter the amount of additional charges: ");
           additionalCharges = scan.nextDouble();
 
           // Compute the new balance
           if (previousBalance > 0) {
               interest = 0.02;
           }

           else {
               interest = 0;
           }
           newBalance = previousBalance + additionalCharges + (interest*previousBalance);
           
           // Compute minimum payment
           if (newBalance < 50) {
               minimumPay = newBalance;
           }
           else if (newBalance > 50 && newBalance <= 300) {
               minimumPay = 50;
           }
           else {
               minimumPay = 0.7*newBalance;
           }
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println("CS CARD International Statement");
           System.out.println("===============================");
           System.out.println();
           System.out.println("Previous Balance:\t" + money.format(previousBalance));
           System.out.println("Additional Charges:\t" + money.format(additionalCharges));
           System.out.println("Interest:\t\t" + money.format(interest));
           System.out.println();
           System.out.println("New Balance:\t\t" + money.format(newBalance));
           System.out.println();
           System.out.println("Minimum Payment:\t" + money.format(minimumPay));
        }
}