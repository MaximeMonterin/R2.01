import java.util.Arrays;

public class Personnel extends Membres_Universitaires {
	protected String etablissementReference;
	protected String[] mail;
	
	public Personnel(int numHarpege, String prenom, String nom, String adresseDomicile, String mail,
			String etablissementReference) {
		super(numHarpege, prenom, nom, adresseDomicile, mail);
		this.etablissementReference = etablissementReference;
	}
	
	public Personnel(int numHarpege, String prenom, String nom, String adresseDomicile, String[] mail,
			String etablissementReference) {
		super(numHarpege, prenom, nom, adresseDomicile);
		this.etablissementReference = etablissementReference;
		this.mail = mail;
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
			return "Personnel [etablissementReference=" + this.etablissementReference + " numHarpege=" + this.getNumHarpege() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom()
			+ ", adresseDomicile=" + this.getAdresseDomicile() +", mail=" + this.getMail() + "]";
		}
		return "Personnel [etablissementReference=" + this.etablissementReference + "numHarpege=" + this.getNumHarpege() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom()
				+ ", adresseDomicile=" + this.getAdresseDomicile() +", mail=" + Arrays.toString(mail) + "]";
	}
	
	
	
	
	
	

}
