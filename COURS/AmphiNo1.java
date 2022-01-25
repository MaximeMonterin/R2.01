/**
 * @author maxime_monterin
 * Train java with YAIP
 */

public class AmphiNo1 {

	public static void main(String[] args) {
		//COURS
		//Construction Séquentiel
		byte valeurTemporaire = 0;
		byte valeurDepart = 0;
		
		byte valeurNegative = -2;
		
		final byte MIN_VALUE = 0; //const
		final byte MAX_VALUE = 5; //const
		
		int calcul = MAX_VALUE * 5; //expression (variable x litéral)
		
		final byte INTNUMFIRST = 2;
		final double DOUBLENUMSECOND = 2.0;
		
		long bigSum = 12345678989L;
		
		System.out.println(calcul);
		System.out.println("Hello world");
		
		
		//Construction Boucle
		while(valeurTemporaire <= 5) {
			System.out.println("Action vaut " + valeurTemporaire);
			++valeurTemporaire;
		}
		
		//Construction Conditonnel
		if(valeurDepart == 0) {
			System.out.println("Test vaut bien 0");
		}
		else {
			System.out.println("Test est différent de 0");
		}
		
		if(INTNUMFIRST == DOUBLENUMSECOND) {
			System.out.println("Les 2 valeurs se valent");
		}
		
		//EXERCICES
		//3.6 Variable names and types
		String name;
		String adress;
		int phoneNumber;
		char gender;
		String dateOfBirth;
		int height;
		int weight;
		String degreePursued;
		int yearOfStudy;
		double averageGPA;
		boolean tuitionGrant;
		boolean scholar;
		int idStudent;
		
		//3.7 program to print an animal picture, made of characters
		char newLineChar = '\n';
		System.out.println("          '__'" + newLineChar + "          (oo)" + newLineChar + " +=========" + "\\/" + newLineChar +
				" / || %%% ||" + newLineChar + "*  ||-----||" + newLineChar + "   \"\"     \"\"");
		
		// Range of int is [-2147483648, 2147483647]

	}

}