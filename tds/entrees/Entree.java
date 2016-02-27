package plic.tds.entrees;

public abstract class Entree {
	
	protected String idf;
	protected int ligne;
	
	public Entree(String nom, int l) {
		idf = nom;
		ligne = l;
	}

	public String getIdf() {
		return idf;
	}

	public int getLigne() {
		return ligne;
	}
	
	public void setIdf(String idf) {
		this.idf = idf;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	
	

}