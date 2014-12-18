
public class Aliment {
	private int idAliment;
	private String nomAliment;
	private int calories;
	
	
	
	public Aliment(int idAliment, String nomAliment, int calories) {
		super();
		this.idAliment = idAliment;
		this.nomAliment = nomAliment;
		this.calories = calories;
	}
	
	public int getIdAliment() {
		return idAliment;
	}
	public void setIdAliment(int idAliment) {
		this.idAliment = idAliment;
	}
	public String getNomAliment() {
		return nomAliment;
	}
	public void setNomAliment(String nomAliment) {
		this.nomAliment = nomAliment;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Aliment [idAliment=" + idAliment + ", nomAliment=" + nomAliment
				+ ", calories=" + calories + "]";
	}
	
	
}
