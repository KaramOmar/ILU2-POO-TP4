package scenarioTest;

import villagegaulois.Etal;
import villagegaulois.IEtal;
import produit.Poisson;
import produit.Sanglier;
import produit.Produit;
public class ScenarioTest{
	
	public static void main(String[] args) {
		IEtal<Produit>[] marche = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<Sanglier>();

        IEtal<Sanglier>[] marche = new IEtal[3];
        marche[0] = etalSanglier;
        
	
	
	}
	
}