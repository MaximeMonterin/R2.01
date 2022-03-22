import java.util.Arrays;
import java.util.List;

public class Etudiant extends Membres_Universitaires{
	private List<UV> uv;
	private CURSUS cursus;
	private Semestre semestre;
	
	public Etudiant(int numHarpege, String prenom, String nom, String adresseDomicile, String mail, CURSUS cursus,
			Semestre semestre, List<UV> uv) {
		super(numHarpege, prenom, nom, adresseDomicile, mail);
		this.uv = uv;
		this.cursus = cursus;
		this.semestre = semestre;
	}

	public List<UV> getUv() {
		return uv;
	}

	public void setUv(List<UV> uv) {
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

	public CURSUS getCursus() {
		return cursus;
	}

	public void setCursus(CURSUS cursus) {
		this.cursus = cursus;
	}

	@Override
	public String toString() {
		return "Etudiant [numHarpege=" + this.getNumHarpege() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom()
		+ ", adresseDomicile=" + this.getAdresseDomicile() + ", mail=" + this.getMail() + ", uv=" + this.getUv() + ", cursus=" + this.getCursus() + 
		", semestre=" + this.getSemestre().toString() +"]";
	}
	
	
	
}
