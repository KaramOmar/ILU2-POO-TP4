package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	private Gaulois chasseur; 
	
	
	public Sanglier(String nom, Unite unite, int poids, Gaulois chasseur) {
		super(nom , unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}


	@Override
	public String description() {
		return (getNom() + " de " + poids + " chassé par " + chasseur);
	}

}
