/**
 * Print first 20 Fibonacci numbers and their average
 */
public class Fibonacci {
   public static void main (String[] args) {
      long n = 3;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
      long fn = 0;             // F(n) to be computed
      long fnMinus1 = 1;   // F(n-1), init to F(2)
      long fnMinus2 = 1;   // F(n-2), init to F(1)
      long nMax = 20;      // maximum n, inclusive
      long sum = fnMinus1 + fnMinus2;  // Need sum to compute average
      double average;
 
      System.out.println("The first " + nMax + " Fibonacci numbers are:");
 
      while (n <= nMax) {  // n starts from 3
		fn = fnMinus1 + fnMinus2;
        ++n;
        fnMinus2 = fnMinus1;
        fnMinus1 = fn;
		System.out.println(fn);
      }
	  
	  average = fn / 20;
	  System.out.println("The average is " + average);
   }
}