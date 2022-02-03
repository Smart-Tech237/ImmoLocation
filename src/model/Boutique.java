package model;

public class Boutique extends Propriete {

	
	public Boutique() {}
	
	public Boutique(int type,int prix,String description,String localisation,int statut) {
		super(type,prix,description,localisation, statut);	
	}


	public int getType() {
		System.out.println("boutique");
		return 2;
	}
	


}
