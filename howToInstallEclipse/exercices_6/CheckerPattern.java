package exercices_6;
import java.util.Scanner;

public class CheckerPattern {

	public static void main(String[] args) {
		
		int number;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an size: "); 
		number = in.nextInt();
		
		for(int row = 1; row <= number; ++row) {
			String carac = "# ";
			for(int col = 1; col <= number; ++col) {
				if(row % 2 == 0) {
					carac = " #";
				}
				System.out.print(carac);
			}
			System.out.println();
		}
		
		in.close();

	}

}
