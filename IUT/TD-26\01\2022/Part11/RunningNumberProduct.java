/**
 * @author maxime_monterin_g4
 * CODE 11.5
 * Multiplie entre eux tous les nombres compris entre 1 et 10
 */

public class RunningNumberProduct {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {

      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 10;   // Store the upperbound
      int prod = 1;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         prod *= number;  // Accumulate number into sum
         number += 1;
	  }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + prod);
   }
}