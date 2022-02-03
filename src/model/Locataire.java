package model;

public class Locataire {
	private int numeroCNI;
	private String nom;
	private String prenom;
	private int telephone;
	private String metier;
	
	
	
	public Locataire() {
		
	}
	
	public int  getIdLocataire() {
		return this.numeroCNI;
		
	}
	
	public Locataire(int numeroCNI, String nom, String prenom, int telephone, String metier) {
		this.numeroCNI = numeroCNI;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.metier = metier;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMetier() {
		return metier;
	}
	public void setMetier(String metier) {
		this.metier = metier;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public int getNumeroCNI() {
		return numeroCNI;
	}
	public void setNumeroCNI(int numeroCNI) {
		this.numeroCNI = numeroCNI;
	}
	
	public void afficher() {
		System.out.println("num CNI "+ this.getNumeroCNI() + "\n Nom: " + this.getNom() + "\n Prenom: " +this.getPrenom() +  "\n Tel: " + this.getTelephone() + "\n Taf: " + this.getMetier());
	}
}
	
