/*
 * Listes toutes les années bissextile depuis 999
 */
public class PrintLeapYears {
   public static void main(String[] args) {
      final int STARTYEAR = 999;
      final int ENDYEAR = 2010;
      int year = STARTYEAR;
	  int compteur = 0;
	  
	  // Une année est bissextile est divisible 4 et 400 mais pas par 100
	  while(year <= ENDYEAR){
		  //Verification de la divisibilité
		  if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			  System.out.println(year);
			  //On sait ici que notre année est bissextile, alors on rajoute 1 au compteur
			  ++compteur;
		  }
		  //On incrémente notre valeur d'année 
		  ++year;
	  }
	  System.out.println(compteur);
   }
}