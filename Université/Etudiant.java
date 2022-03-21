public class Etudiant extends Membres_Universitaires{
	private UV uv;
	private Semestre semestre;
	
	public Etudiant(int numHarpege, String prenom, String nom, String adresseDomicile, String mail, UV uv,
			Semestre semestre) {
		super(numHarpege, prenom, nom, adresseDomicile, mail);
		this.uv = uv;
		this.semestre = semestre;
	}

	public UV getUv() {
		return uv;
	}

	public void setUv(UV uv) {
		this.uv = uv;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	
	
	public boolean admission(Semestre semestre) {
		return (semestre.average() == 10);
	}

	@Override
	public String toString() {
		return "Etudiant [numHarpege=" + this.getNumHarpege() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom()
		+ ", adresseDomicile=" + this.getAdresseDomicile() + ", mail=" + this.getMail() + ", uv=" + this.getUv() + ", semestre=" + this.getSemestre().toString() +"]";
	}
	
	
	
}
