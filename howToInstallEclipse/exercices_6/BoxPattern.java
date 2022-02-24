package exercices_6;
import java.util.Scanner;

public class BoxPattern {
	
	public static void Carre(int taille) {
		//Parcours de chaque ligne avec cette boucle
		for (int row = 1; row <= taille; row++) {
			//Parcours de chaque colonnes avec cette boucle
			for (int col = 1; col <= taille; col++) {
				//Condition qui vérifie les placements des symboles pour former un carré
				if (row == 1 || row == taille || col == 1 || col == taille) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			//Retour à la ligne quand la taille des lignes (définie par l'user) est atteint
			System.out.println();
		}
	}
	
	public static void FormeZ(int taille) {
		//Parcours de chaque ligne avec cette boucle
		for (int row = 1; row <= taille; row++) {
			//Parcours de chaque colonnes avec cette boucle
			for (int col = 1; col <= taille; col++) {
				if (row == 1 || row == taille || row == col) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			//Retour à la ligne quand la taille des lignes (définie par l'user) est atteint
			System.out.println();
		}
	}
	
	public static void FormeZInverse(int taille) {
		//Parcours de chaque ligne avec cette boucle
		for (int row = 1; row <= taille; row++) {
			//Parcours de chaque colonnes avec cette boucle
			for (int col = 1; col <= taille; col++) {
				if (row == taille|| row == 1 || row + col == taille + 1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			//Retour à la ligne quand la taille des lignes (définie par l'user) est atteint
			System.out.println();
		}
	}
	
	public static void Sablier(int taille) {
		//Parcours de chaque ligne avec cette boucle
		for (int row = 1; row <= taille; row++) {
			//Parcours de chaque colonnes avec cette boucle
			for (int col = 1; col <= taille; col++) {
				if ((row == taille|| row == 1 || row + col == taille + 1) || (row == 1 || row == taille || row == col)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			//Retour à la ligne quand la taille des lignes (définie par l'user) est atteint
			System.out.println();
		}
	}
	
	public static void FusionDesFormes(int taille) {
		//Parcours de chaque ligne avec cette boucle
		for (int row = 1; row <= taille; row++) {
			//Parcours de chaque colonnes avec cette boucle
			for (int col = 1; col <= taille; col++) {
				if (((row == taille|| row == 1 || row + col == taille + 1) || (row == 1 || row == taille || row == col)) || (row == 1 || row == taille || col == 1 || col == taille)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			//Retour à la ligne quand la taille des lignes (définie par l'user) est atteint
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int taille;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an size: "); 
		taille = in.nextInt();

		Carre(taille);
		System.out.println();
		FormeZ(taille);
		System.out.println();
		FormeZInverse(taille);
		System.out.println();
		Sablier(taille);
		System.out.println();
		FusionDesFormes(taille);
		
		in.close();

	}

}
