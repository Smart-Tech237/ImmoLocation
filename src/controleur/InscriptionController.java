package controleur;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



import model.Inscription;



public class InscriptionController {
	
	private boolean exist,reussi;
	
	
	static ConnexionBD conn = new ConnexionBD();
	

	
	/*cle logiciel n'admet qu'un seul utilisateur
	cette methode a pour but de s'assurer qu'il n'existe pas de d'utilisateur inscrit en bd
	elle retourne vrai si il existe deja un utilisateur et faux si non
	*/
	public boolean verifEtatInscription(Inscription inscription) {	
		
		try {
				
			String requete ="SELECT * FROM bailleur";
			
			ResultSet res = conn.select(requete);
			
			ResultSetMetaData rsmd = res.getMetaData(); //recuperation des metas données
			
			int nbcolone = rsmd.getColumnCount();//recuperation du nombre de colone present en bd
			
			if( nbcolone <= 0 ) {// ceci sinifie que rien n'est encore encore enregisté en BD
				
				this.exist = false ;
				
			}
			else {
				
				this.exist = true ;
				
			}
			
		}
		catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return exist;
		
	}

	/*
	 * cette methode permet d'enregistrer un bailleur en base de donnée lorsque ce dernier n'existe pas
	 * elle retourne true si l'enregistrement est fait et false si non
	 */
	public boolean enregistrerBailleur(Inscription obj) {
		
		String requete = "INSERT INTO bailleur VALUES ("+obj.getId()+" "+obj.getNom()+" "
				+ " "+obj.getPrenom()+" "+obj.getContact()+" "+obj.getMdp()+")";
		
		if( verifEtatInscription(obj) == true ) {
			
			System.out.println("rapel au codeur : il existe un utilisateur.faire par a l'utilisateur");
			
			this.reussi = false;
			
			
		}
		else {
			
			conn.update(requete);
			
			this.reussi =true;
		}
		
	return this.reussi;
		
	}
	
	/*
	 * cette methode permet d'afficher les informations du bailleur
	 */
	
	public Inscription infoBailleur() {
		
		String requete ="SELECT * FROM bailleur";
		
	try {
		
	
		ResultSet res = conn.select(requete);
		
		ResultSetMetaData rsmd = res.getMetaData();
		
		for ( int i = 1 ; i <= rsmd.getColumnCount(); i++ ) {
			
			while( res.next()) {
				
				Inscription ins = new Inscription();
				
				
				
			}
		}
		
	}
	catch(SQLException e) {
		
		e.printStackTrace();
		
	}
		return null;
	}

}
