package model;




public class Authentification {
	private String user_name;
	private String pwd;
	private String statut;
	
	public Authentification() {};
		
	
	public Authentification(String usr, String pass) {
		this.setUser_name(usr);
		this.setPwd(pass);
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	
}
