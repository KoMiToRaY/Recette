import java.util.ArrayList;

public class Recette {
	private int idRecette;
	private String nomRecette;
	private int tempsPreparation;
	private int tempsCuisson;
	private int niveauDifficulte;
	private Type leType;
	public static ArrayList<Aliment> lesAliments = new ArrayList<Aliment>();
	
	
	
	
	
	public Recette(int idRecette, String nomRecette, int tempsPreparation,
			int tempsCuisson, int niveauDifficulte, Type leType,
			ArrayList<Aliment> lesAliments) {
		super();
		this.idRecette = idRecette;
		this.nomRecette = nomRecette;
		this.tempsPreparation = tempsPreparation;
		this.tempsCuisson = tempsCuisson;
		this.niveauDifficulte = niveauDifficulte;
		this.leType = leType;
		this.lesAliments = lesAliments;
	}
	
	
	public int getIdRecette() {
		return idRecette;
	}
	public void setIdRecette(int idRecette) {
		this.idRecette = idRecette;
	}
	public String getNomRecette() {
		return nomRecette;
	}
	public void setNomRecette(String nomRecette) {
		this.nomRecette = nomRecette;
	}
	public int getTempsPreparation() {
		return tempsPreparation;
	}
	public void setTempsPreparation(int tempsPreparation) {
		this.tempsPreparation = tempsPreparation;
	}
	public int getTempsCuisson() {
		return tempsCuisson;
	}
	public void setTempsCuisson(int tempsCuisson) {
		this.tempsCuisson = tempsCuisson;
	}
	public int getNiveauDifficulte() {
		return niveauDifficulte;
	}
	public void setNiveauDifficulte(int niveauDifficulte) {
		this.niveauDifficulte = niveauDifficulte;
	}
	public Type getLeType() {
		return leType;
	}
	public void setLeType(Type leType) {
		this.leType = leType;
	}
	public ArrayList<Aliment> getLesAliments() {
		return lesAliments;
	}
	public void setLesAliments(ArrayList<Aliment> lesAliments) {
		this.lesAliments = lesAliments;
	}

	@Override
	public String toString() {
		return "Recette [idRecette=" + idRecette + ", nomRecette=" + nomRecette
				+ ", tempsPreparation=" + tempsPreparation + ", tempsCuisson="
				+ tempsCuisson + ", niveauDifficulte=" + niveauDifficulte
				+ ", leType=" + leType + "]";
	}
	


}
