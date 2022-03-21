import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Personnel_Enseignant extends Personnel {
	private int serviceAttendu;
	private Map<UV, Integer> heureSemestre = new HashMap<UV, Integer>();
	private int serviceAnnuel;
	
	public Personnel_Enseignant(int numHarpege, String prenom, String nom, String adresseDomicile, String mail,
			String etablissementReference, int serviceAttendu, Map<UV, Integer> heureSemestre, int serviceAnnuel) {
		super(numHarpege, prenom, nom, adresseDomicile, mail, etablissementReference);
		this.serviceAttendu = serviceAttendu;
		this.heureSemestre = heureSemestre;
		this.serviceAnnuel = serviceAnnuel;
	}
	
	public Personnel_Enseignant(int numHarpege, String prenom, String nom, String adresseDomicile, String[] mail,
			String etablissementReference, int serviceAttendu, Map<UV, Integer> heureSemestre, int serviceAnnuel) {
		super(numHarpege, prenom, nom, adresseDomicile, mail, etablissementReference);
		this.serviceAttendu = serviceAttendu;
		this.heureSemestre = heureSemestre;
		this.serviceAnnuel = serviceAnnuel;
	}

	public int getServiceAttendu() {
		return serviceAttendu;
	}

	public void setServiceAttendu(int serviceAttendu) {
		this.serviceAttendu = serviceAttendu;
	}

	public Map<UV, Integer> getHeureSemestre() {
		return heureSemestre;
	}

	public void setHeureSemestre(Map<UV, Integer> heureSemestre) {
		this.heureSemestre = heureSemestre;
	}

	public int getServiceAnnuel() {
		return serviceAnnuel;
	}

	public void setServiceAnnuel(int serviceAnnuel) {
		this.serviceAnnuel = serviceAnnuel;
	}

	@Override
	public String toString() {
		if(mail == null) {
			return "Personnel_Enseignant [etablissementReference=" + this.etablissementReference + " numHarpege=" + this.getNumHarpege() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom()
			+ ", adresseDomicile=" + this.getAdresseDomicile() + ", mail=" + this.getMail() + "]";
		}
		return "Personnel_Enseignant [etablissementReference=" + this.etablissementReference + "numHarpege=" + this.getNumHarpege() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom()
				+ ", adresseDomicile=" + this.getAdresseDomicile() + ", mail=" + Arrays.toString(mail) + "]";
	}
	
	
	

}
