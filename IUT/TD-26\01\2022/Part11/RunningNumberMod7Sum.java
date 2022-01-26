/**
 * @author maxime_monterin_g4
 * CODE 11.3
 * Ajoute entre eux tous les nombres divisibles par 7 entre 1 et 1000
 */

public class RunningNumberMod7Sum {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {

      final int LOWERBOUND = 7;      // Store the lowerbound
      final int UPPERBOUND = 1000;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         sum = sum + number;  // Accumulate number into sum
         number += 7;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }
}