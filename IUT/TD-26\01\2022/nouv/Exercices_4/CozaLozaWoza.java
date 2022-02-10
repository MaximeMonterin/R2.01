public class CozaLozaWoza {   // Save as "CozaLozaWoza.java"

   public static void main(String[] args) {

      final int LOWERBOUND = 1, UPPERBOUND = 110;
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // number = LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND
         // Print "CozaLoza" if number is divisible by 3 and 5
		 if (number % 3 == 0 && number % 5 == 0){
			 System.out.print("CozaLoza");
		 // Print "Coza" if number is divisible by 3
		 }
         else if (number % 3 == 0) {
            System.out.print("Coza");
         }
         // Print "Loza" if number is divisible by 5
         else if(number % 5 == 0) {
            System.out.print("Loza");
         }
         // Print "Woza" if number is divisible by 7
         else if (number % 7 == 0) {
            System.out.print("Woza");
         }
         // Print the number if it is not divisible by 3, 5 and 7 (i.e., it has not been processed above)
         else {
            System.out.print(number);
         }
         // After processing the number, print a newline if number is divisible by 11; 
         // else print a space
         if (number % 11 == 0) {
            System.out.println();  // print newline
         } else {
            System.out.print(" ");  // print a space
         }
      }
   }
}