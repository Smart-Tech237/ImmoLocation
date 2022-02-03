package model;

public class Maison extends Propriete{
	
	public Maison() {}
	
	public Maison(int type,int prix, String description,String localisation,int statut) {
		super(type,prix,description,localisation, statut);	
	}



	public int getType() {
		System.out.println("maison");
		return 1;
	}




}
