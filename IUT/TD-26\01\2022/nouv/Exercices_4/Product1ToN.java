public class Product1ToN{
	
	public static void main(String[] args){
      // Define variables
      long product = 1;      // The accumulated product, init to 1
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 13;

	  for(int number = LOWERBOUND; number <= UPPERBOUND; ++number){
		  product *= number;
	  }
	  
	  System.out.println(product);
	}
}