import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		
		// J'en suis au toString() du personnel enseignant
		
		//CREATION DU PERSONNEL ET D'UN ADMINISTRATIF
		Personnel Hugo = new Personnel(12, "Hugo", "Domage", "13 avenue de la fleur", "hugo.domage@gmail.com", "IUT AIX");
		System.out.println(Hugo.toString());
		
		String[] mailJules = new String[2];
		mailJules[0] = "jules.counde@gmail.com";
		mailJules[1] = "julesLeGamer@gmail.com";
		Personnel Jules = new Personnel(11, "Jules", "Counde", "12 rue du chene", mailJules, "IUT AIX");
		System.out.println(Jules.toString());
		
		Administratif Boix = new Administratif(10, "Lucile", "Boix", "230 rue du courrier", "lucile.boix@gmail.com", "IUT AIX");
		System.out.println(Boix.toString());
		
		String[] mailBoix = new String[2];
		mailBoix[0] = "lucile.boix@gmail.com";
		mailBoix[1] = "boixLucile@yahoo.fr";
		Administratif Boix2 = new Administratif(10, "Lucile", "Boix", "230 rue du courrier", mailBoix, "IUT AIX");
		System.out.println(Boix2.toString());
		
		
		//CREATION D'UN ETUDIANT
		Map<Double, Double> evalLucas = new HashMap<Double, Double>();
		evalLucas.put(12.0, 0.5);
		evalLucas.put(14.0, 2.0);
		Semestre Lucas_1 = new Semestre(1, evalLucas);
		List<UV> uvLucas = new ArrayList<UV>();
		uvLucas.add(UV.ANGLAIS);
		uvLucas.add(UV.HTML);
		Etudiant Lucas = new Etudiant(1, "Lucas", "Rodriguez", "Chez Irelia", "lucas.fandeirelia@gmail.com", CURSUS.DUT, Lucas_1, uvLucas);
		System.out.println(Lucas.toString());
	}

}
