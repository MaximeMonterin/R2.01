import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Etudiant extends Membres_Universitaires{
	private UV uv;
	private Semestre semestre;
	
	public Etudiant(int numHarpege, String prenom, String nom, String adresseDomicile, String mail, UV uv,
			Semestre semestre) {
		super(numHarpege, prenom, nom, adresseDomicile, mail);
		this.uv = uv;
		this.semestre = semestre;
	}
	
	public boolean admission(Semestre semestre) {
		return (semestre.average() == 10);
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

	@Override
	public String toString() {
		return "Etudiant [uv=" + this.uv + ", semestre=" + this.semestre.toString() + "]";
	}
	
	
	
}
