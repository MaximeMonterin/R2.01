/**
 * @author maxime_monterin_g4
 * CODE 11.4
 * Ajoute entre eux tous les carrées des nombres compris entre 1 et 1000
 */

public class RunningNumberSquareSum {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {

      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 100;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         sum += number*number;  // Accumulate number into sum
         number += 1;
	  }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }
}