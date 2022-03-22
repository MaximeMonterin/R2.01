import java.util.Map;

public class Enseignant_Chercheur extends Personnel_Enseignant {
	private String etablissementRecherche;
	private int serviceStatuaire;
	private int decharge;
	
	public Enseignant_Chercheur(int numHarpege, String prenom, String nom, String adresseDomicile, String mail,
			String etablissementReference, int serviceAttendu, Map<UV, Integer> heureSemestre, int serviceAnnuel,
			String etablissementRecherche, int serviceStatuaire, int decharge) {
		super(numHarpege, prenom, nom, adresseDomicile, mail, etablissementReference, serviceAttendu, heureSemestre,
				serviceAnnuel);
		this.etablissementRecherche = etablissementRecherche;
		this.serviceStatuaire = serviceStatuaire;
		this.decharge = decharge;
	}

	public String getEtablissementRecherche() {
		return etablissementRecherche;
	}

	public void setEtablissementRecherche(String etablissementRecherche) {
		this.etablissementRecherche = etablissementRecherche;
	}

	public int getServiceStatuaire() {
		return serviceStatuaire;
	}

	public void setServiceStatuaire(int serviceStatuaire) {
		this.serviceStatuaire = serviceStatuaire;
	}

	public int getDecharge() {
		return decharge;
	}

	public void setDecharge(int decharge) {
		this.decharge = decharge;
	}
	
	
	
}
