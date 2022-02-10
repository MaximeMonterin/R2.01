/**
 * @object [IUT][GRP4] TDP2 EXO 4.1.1 TO 4.1.6
 * @contact maxime.monterin@etu.univ-amu.fr
 * @author maxime_monterin_g4
 */

public class SumAverageRunningInt {
	
	//Fonction pour la somme de chaque entier entre eux entre 1 et 100
	private static Integer sumOneToHundred(final int LOWERBOUND, final int UPPERBOUND){
		int sum = 0;
		
		for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			sum += number;
		}
		//On retourne la somme
		return sum;
	}
	
	//Fonction pour la somme de chaque entier paires (Even) entre eux entre 1 et 100
	private static Integer sumEvenNumbers(final int LOWERBOUND, final int UPPERBOUND){
		int sum = 0;
		
		for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			if(number % 2 == 0){ //On vérifie ici si notre nombre est paire, par le reste de la division par 2 (il faut qu'il soit égal à 0)
				sum += number;
			}
		}
		//On retourne la somme
		return sum;
	}
	
	//Fonction pour la somme de chaque entier impaires (Odd) entre eux entre 1 et 100
	private static Integer sumOddNumbers(final int LOWERBOUND, final int UPPERBOUND){
		int sum = 0;
		
		for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			if(number % 2 != 0){ //On vérifie ici si notre nombre est impaire, par le reste de la division par 2 (il faut qu'il soit différent de 0)
				sum += number;
			}
		}
		//On retourne la somme
		return sum;
	}
	
	//Dépendante des 2 fonctions plus hautes (paires et impaires), elle permet de soustraire les 2 sommes des valeurs paires et impaires
	private static Integer differenceBetweenOddAndEven(final int LOWERBOUND, final int UPPERBOUND){
		int odd = sumOddNumbers(LOWERBOUND, UPPERBOUND); //Sommes des nombres impaires
		int even = sumEvenNumbers(LOWERBOUND, UPPERBOUND); //Somme des nombres paires 
		int difference = 0;
		
		difference = (odd > even) ? odd - even : even - odd; // <- Condition qui nous permet de savoir quelle somme est la plus grande, pour éviter d'avoir un nombre negatif
		
		//On retourne le résultat de la soustraction
		return difference;
	} 
	
	//Fonction qui permet de faire la moyenne de la somme de tous les nombres entre eux de 1 à 100
	private static Double averageOneToHundred(final int LOWERBOUND, final int UPPERBOUND){
		int sum = 0;
		int cpt = 0;
		double average = 0;
		
		//Boucle qui fait la somme des nombres de 1 à 100
		for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			sum += number;
			++cpt; //<- on recup le nombre total de nombres entre la valeur de début (ici 1) et celle de fin (ici 100)
		}
		
		average = sum / cpt; //<- calcul de la moyenne
		
		//On retourne la moyenne
		return average;
	}
	
	//Fonction qui permet de faire la somme de tous les nombres carrés entre eux entre une borne de début (1) et une borne de fin (100)
	private static Integer sumOfSquares(final int LOWERBOUND, final int UPPERBOUND){
		int sum = 0;
		
		//Boucle qui fait la somme des carrés des nombres de 1 à 100
		for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			sum += (number*number);
		}
		
		//On retourne notre somme
		return sum;
	}
	
	public static void main (String[] ags){
		
		//Définition de nos bornes minimales et maximales
	    final int LOWERBOUND = 1; //Minimale
        final int UPPERBOUND = 100; //Maximale
		
		//Tous les appels des différentes fonctions du fichier
		System.out.println("La somme des nombres de " + LOWERBOUND + " à " + UPPERBOUND + " est de " + sumOneToHundred(LOWERBOUND, UPPERBOUND)); //Somme des nombres de 1 à 100
		System.out.println("La somme des carrés des nombres de " + LOWERBOUND + " à " + UPPERBOUND + " est de " + sumOfSquares(LOWERBOUND, UPPERBOUND)); //Somme des carrés des nombres de 1 à 100
		System.out.println("La somme des nombres paires entre " + LOWERBOUND + " et " + UPPERBOUND + " est de " + sumEvenNumbers(LOWERBOUND, UPPERBOUND)); //Somme des nombres paires de 1 à 100
		System.out.println("La somme des nombres impaires entre " + LOWERBOUND + " et " + UPPERBOUND + " est de " + sumOddNumbers(LOWERBOUND, UPPERBOUND)); //Somme des nombres impaires de 1 à 100
		System.out.println("La difference entre la somme des nombres impaires et paires est de " + differenceBetweenOddAndEven(LOWERBOUND, UPPERBOUND)); //Différences entre les 2 sommes ci-dessus
		System.out.println("La moyenne des nombres de " + LOWERBOUND + " à " + UPPERBOUND + " est de " + averageOneToHundred(LOWERBOUND, UPPERBOUND)); //Moyenne de la somme des nombres entre 1 à 100
	}

}
	