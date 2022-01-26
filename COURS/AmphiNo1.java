/**
 * @author maxime_monterin
 * Train java with YAIP
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AmphiNo1 {

	public static void main(String[] args) throws FileNotFoundException {
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
		
		String chaineNoUn = "Test";
		String chaineNoDeux = "test";
		
		System.out.println(chaineNoUn.equalsIgnoreCase(chaineNoDeux));
		
		System.out.println("Voici un chiffre au hasard : " + 9);
		
		System.out.println(calcul);
		System.out.println("Hello world");
		
	    //TESTS nested vs sequential
	    char grade;
	    int mark = 81;
	    if (mark > 80) {  // [81, 100]
	    	grade = 'A';
	    }
	    if (mark > 65 && mark <= 80) {  // [66, 80]
	    	grade = 'B';
	    }
	    if (mark >= 50 && mark <= 65) { // [50, 65]
	    	grade = 'C';
	    }
	    if (mark < 50) {  // [0, 49]
	    	grade = 'F';
	    }

	    // This "nested-if" is BETTER
	    // Try mark = 81, which only run thru only the first if.
	    if (mark > 80) {   // [81, 100]
	    	grade = 'A';
	    } else if (mark > 65 && mark <= 80) {  // [66, 80]
	    	grade = 'B';
	    } else if (mark >= 50 && mark <= 65) { // [50, 65]
	    	grade = 'C';
	    } else {
	    	grade = 'F';    // [0, 49]
	    }

	    // This "nested-if" is the BEST with fewer tests
	    if (mark > 80) {         // [81, 100]
	    	grade = 'A';
	    } else if (mark > 65) {  // [66, 80]
	    	grade = 'B';
	    } else if (mark >= 50) { // [50, 65]
	    	grade = 'C';
	    } else {                 // [0, 49]
	    	grade = 'F';
	    }
		
		
		//Construction Boucle
		while(valeurTemporaire <= 5) {
			System.out.println("Action vaut " + valeurTemporaire);
			++valeurTemporaire;
		}
		
		for(int i = 0; i <= 5; ++i)
			System.out.println("Action vaut " + i);
		
		
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
		
		
		//4.10 Write an expression for all unmarried male, age between 21 and 35, with height above 180, and weight between 70 and 80.
		int age = 18;
	    double weightSecond = 71.23;
	    int heightSecond = 191;
	    boolean married = false;
	    boolean attached = false;
	    char genderSecond = 'm';
	    
	    System.out.println((married == false) && (age >= 21 && age <=35) && (heightSecond <= 180) && (weightSecond >= 70 && weightSecond <= 80));
	    
	    //4.10 Given the year, month (1-12), and day (1-31), write a boolean expression which returns true for dates before October 15, 1582 (Gregorian calendar cut-over date).
	    int year = 1582;
	    int month = 10;
	    int day = 14;
	    
	    System.out.println((year <= 1582) && (month >= 1 && month <= 10) && (day >= 1 && day < 15));
	    
	    //Tests entrées console
	    int numUtilisateur;
	    
	    Scanner in = new Scanner(System.in);
	    System.out.println("Veuillez entrer le numéro souhaité : ");
	    numUtilisateur = in.nextInt();
	    System.out.println("Voici votre numéro : " + (numUtilisateur + 1));
	    
	    System.out.println("Veuillez entrer un mot : ");
	    String strUtilisateur = in.nextLine();
	    strUtilisateur += in.nextLine();
	    System.out.println("Voici votre mot : " + strUtilisateur);
	    
	    
        File file = new File("file.txt");
        Scanner fileName = new Scanner(file);

        while (fileName.hasNextLine()) {
            String line = fileName.nextLine();
            System.out.println(line);
        }
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le nom de votre fichier : ");
        
        File fileImport = new File(scan.next());
        scan = new Scanner(fileImport);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
	}

}