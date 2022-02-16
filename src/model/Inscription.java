package model;

public class Inscription {
//l'incription doit se faire une et une seule fois dans l'application
	
	private int id,cni,contact;
	private String mdp,nom,prenom;
	
	public Inscription() {
		
	}
	
	public Inscription(String mNom, String mPrenom, int mCni, int mContact, String mMdp){
		
		this.nom = mNom;
		
		this.prenom = mPrenom;
		
		this.cni = mCni;
		
		this.contact = mContact;
		
		this.mdp = mMdp;
		
		
		
	}
	
	public int getContact() {
		return contact;
	}
	
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCni() {
		return cni;
	}
	
	public void setCni(int cni) {
		this.cni = cni;
	}
	
	public String getMdp() {
		return mdp;
	}
	
	public void setMdp(String mdp) {
		this.mdp = mdp;
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
	
}
