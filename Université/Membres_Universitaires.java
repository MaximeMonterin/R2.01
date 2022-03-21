public class Membres_Universitaires {
	private int numHarpege;
	private String prenom;
	private String nom;
	private String adresseDomicile;
	private String mail;
	
	public Membres_Universitaires(int numHarpege, String prenom, String nom, String adresseDomicile, String mail) {
		this.numHarpege = numHarpege;
		this.prenom = prenom;
		this.nom = nom;
		this.adresseDomicile = adresseDomicile;
		this.mail = mail;
	}
	
	public Membres_Universitaires(int numHarpege, String prenom, String nom, String adresseDomicile) {
		this.numHarpege = numHarpege;
		this.prenom = prenom;
		this.nom = nom;
		this.adresseDomicile = adresseDomicile;
	}

	public int getNumHarpege() {
		return numHarpege;
	}

	public void setNumHarpege(int numHarpege) {
		this.numHarpege = numHarpege;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresseDomicile() {
		return adresseDomicile;
	}

	public void setAdresseDomicile(String adresseDomicile) {
		this.adresseDomicile = adresseDomicile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Membres_Universitaires [numHarpege=" + this.numHarpege + ", prenom=" + this.prenom + ", nom=" + this.nom
				+ ", adresseDomicile=" + this.adresseDomicile + ", mail=" + this.mail + "]";
	}
	
	
	
}
