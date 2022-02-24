package exercices_6;
import java.util.Scanner;

public class TriangularPattern {
	
	public static void TriangleA(int taille) {
		for (int row = 1; row <= taille; row++) {
			for (int col = 1; col <= taille; col++) {
				if (col <= row) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
	
	public static void TriangleB(int taille) {
		for (int row = 1; row <= taille; row++) {
			for (int col = 1; col <= taille; col++) {
				if (row + col <= taille + 1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
	
	public static void TriangleC(int taille) {
		for (int row = 1; row <= taille; row++) {
			for (int col = 1; col <= taille; col++) {
				if (col >= row) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
	
	public static void TriangleD(int taille) {
		for (int row = 1; row <= taille; row++) {
			for (int col = 1; col <= taille; col++) {
				if (row + col >= taille + 1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		
		int taille;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an size: "); 
		taille = in.nextInt();
		
		TriangleA(taille);
		System.out.println();
		TriangleB(taille);
		System.out.println();
		TriangleC(taille);
		System.out.println();
		TriangleD(taille);
		
		in.close();

	}

}
