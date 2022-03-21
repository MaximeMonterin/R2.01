import java.util.Arrays;

public class Administratif extends Personnel{

	public Administratif(int numHarpege, String prenom, String nom, String adresseDomicile, String mail,
			String etablissementReference) {
		super(numHarpege, prenom, nom, adresseDomicile, mail, etablissementReference);
	}
	
	public Administratif(int numHarpege, String prenom, String nom, String adresseDomicile, String[] mail,
			String etablissementReference) {
		super(numHarpege, prenom, nom, adresseDomicile, mail, etablissementReference);
	}
	
	public String getEtablissementReference() {
		return etablissementReference;
	}

	public void setEtablissementReference(String etablissementReference) {
		this.etablissementReference = etablissementReference;
	}

	public String[] getMailList() {
		return this.mail;
	}

	public void setMail(String[] mail) {
		this.mail = mail;
	}
	
	@Override
	public String toString() {
		if(mail == null) {
			return "Administratif [etablissementReference=" + this.etablissementReference + " numHarpege=" + this.getNumHarpege() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom()
			+ ", adresseDomicile=" + this.getAdresseDomicile() +", mail=" + this.getMail() + "]";
		}
		return "Administratif [etablissementReference=" + this.etablissementReference + "numHarpege=" + this.getNumHarpege() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom()
				+ ", adresseDomicile=" + this.getAdresseDomicile() +", mail=" + Arrays.toString(mail) + "]";
	}
}
