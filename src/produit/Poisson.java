package produit;

public class Poisson extends Produit{
	private String date;
	
	public Poisson(String nom, Unite unite, String date) {
		super(nom, unite.PIECE);
		this.date = date;
	}
	
	public String description() {
		return (getNom() + " pêché " + date);
		
	}
}
