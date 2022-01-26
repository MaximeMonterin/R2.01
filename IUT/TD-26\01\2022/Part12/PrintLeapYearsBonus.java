/**
 * @author maxime_monterin_g4
 * CODE BONUS 12.3
 * Liste toutes les années bissextile depuis l'an 999, par paquet de 10 années
 */

import java.util.*;

public class PrintLeapYearsBonus {

   //Fonction qui permet d'ajouter dans une liste nos années bissextiles
   private static List<Integer>getLeapYears(final int STARTYEAR, final int ENDYEAR){

   	//Initialisation de notre liste
   	List<Integer> yearList = new ArrayList<>();
   	int year = STARTYEAR;

   	//Tant que notre compteur d'année n'atteint pas la borne finale:
   	while(year <= ENDYEAR){

   		//On vérifie si une année est bissextile par sa divisibilité par 4 et 400 mais pas par 100
   		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){

   			//On ajoute l'année à notre liste
   			yearList.add(year);
   		}

   		++year;
   	}

   	return yearList;
   }

   //Notre classe main qui gère l'affichage des années
   public static void main(String[] args) {

   	//Nos valeurs qui serviront de bornes
      final int STARTYEAR = 999;
      final int ENDYEAR = 2010;

	   int compteur = 0;

	   //Initialisation de la liste contenant toutes nos années bissextiles
	   List<Integer> yearList = getLeapYears(STARTYEAR, ENDYEAR);

	   //Parcours de notre liste
	   for(int i = 0; i < yearList.size(); ++i){

	   	//Affichage des années sur une seule ligne
	   	System.out.print(yearList.get(i) + " ");
	   	++compteur;

	   	//Si notre compteur atteint 10, alors on le réinitialise et l'affichage recommence sur la ligne suivante
	   	if(compteur % 10 == 0){
	   		System.out.print('\n');
	   	}
	   }

	   //Affichage du compteur d'année
	   System.out.println('\n' + "Le nombre d'années bissextiles entre " + STARTYEAR + " et " + ENDYEAR + 
	   	" est de: " + compteur);
   }
}