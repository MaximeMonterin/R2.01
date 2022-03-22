import java.util.Map;

public class Enseignant extends Personnel_Enseignant{
	private int serviceStatuaire;

	public Enseignant(int numHarpege, String prenom, String nom, String adresseDomicile, String mail,
			String etablissementReference, int serviceAttendu, Map<UV, Integer> heureSemestre, int serviceAnnuel,
			int decharge, int serviceStatuaire) {
		super(numHarpege, prenom, nom, adresseDomicile, mail, etablissementReference, serviceAttendu, heureSemestre,
				serviceAnnuel, decharge);
		this.serviceStatuaire = serviceStatuaire;
	}

	public int getServiceStatuaire() {
		return serviceStatuaire;
	}

	public void setServiceStatuaire(int serviceStatuaire) {
		this.serviceStatuaire = serviceStatuaire;
	}
	
}
