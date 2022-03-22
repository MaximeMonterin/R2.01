import java.util.Map;
import java.util.Map.Entry;

public class Semestre {
	private int semestre;
	private Map<Double, Double> evals;
	
	public Semestre(int semestre, Map<Double, Double> evals) {
		this.semestre = semestre;
		this.evals = evals;
	}
	
	public double average() {
		double sum = 0.0;
		for(Entry<Double, Double> values : evals.entrySet()) {
			sum += values.getKey() * values.getValue();
		}
		sum = sum / evals.size();
		return sum;
	}

	@Override
	public String toString() {
		return "Semestre [semestre=" + this.semestre + ", evals=" + this.evals + "]";
	}
	
	
	

}
