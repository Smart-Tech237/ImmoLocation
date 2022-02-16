package model;

public  class Propriete {
	
	protected int type;
	private int prix;
	private String description;
	private String localisation;
	protected static int statut;
	private int id;

	public Propriete() {}
	
	public Propriete(int type, int prix, String description, String localisation,int statut) {
		
		this.type=type;
		this.prix=prix;
		this.description=description;
		this.localisation=localisation;
		this.statut=statut;	
	
	}
	public void setType(int type) {
		this.type=type;
	}
	
	public int getType() {
		return this.type;
	}

	


	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return this.description;
		
	}
	public void setDescription(String description) {
		this.description=description;
	}


	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getStatut(){
		
		return  this.statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
