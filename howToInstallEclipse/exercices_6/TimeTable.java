package exercices_6;
import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		
		int number;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an size: "); 
		number = in.nextInt();
		
		for(int row = 1; row <= number; ++row) {
			for(int col = 1; col <= number; ++col) {
				System.out.print(col + ' ');
			}
		}
		
		in.close();

	}

}
