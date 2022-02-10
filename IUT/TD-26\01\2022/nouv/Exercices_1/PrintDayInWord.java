/**
 * Trying nested-if and switch-case statements.
 */
public class PrintDayInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 5;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 0) {   // Use == for comparison
         System.out.println("SUNDAY");
      } else if (number == 1) {
         System.out.println("MONDAY");
      } else if (number == 2) {
         System.out.println("THUESDAY");
      } else if (number == 3) {
         System.out.println("WEDNESDAY");
      } else if (number == 4) {
         System.out.println("THURSDAY");
	  } else if (number == 5) {
         System.out.println("FRIDAY");
	  } else if (number == 6) {
         System.out.println("SATURDAY");
      } else {
         System.out.println("NOT A VALID DAY");
      }
 
      // Using switch-case-default
      switch(number) {
         case 0: 
            System.out.println("SUNDAY"); break;  // Don't forget the "break" after each case!
         case 1: 
            System.out.println("MONDAY"); break;
         case 2: 
            System.out.println("THUESDAY"); break;
		 case 3: 
            System.out.println("WEDNESDAY"); break;
		 case 4: 
            System.out.println("THURSDAY"); break;
		 case 5: 
            System.out.println("FRIDAY"); break;
		 case 6: 
            System.out.println("SATURDAY"); break;
         default: System.out.println("NOT A VALID DAY"); 
      }
   }
}