

import vue.*;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import controleur.*;
import model.*;

import model.*;
import vue.LoginFrame;


public class Main {

	public static void main(String[] args) {
	LoginFrame log= new LoginFrame();
		 log.lanceur();
	//Controlleur<Authentification> infoIHM= new Controlleur<Authentification>();
	//Controlleur<Authentification> infoBD= new Controlleur<Authentification>();
		
    	
   /* ConnexionBD conn = new ConnexionBD();	
    		
    String requete = "SELECT * FROM propriete WHERE status = 2";
   try { 
    ResultSet resultat = conn.select(requete);
    
    ResultSetMetaData MetaData = resultat.getMetaData(); //recuperation des données de la requete
   
    while (resultat.next()) {

       for (int i = 1; i <= MetaData.getColumnCount(); i++) {
    	   
        System.out.println (resultat.getString(i) );
         
       }
   
    }
    
    resultat.close();
 }
   catch (SQLException e) {
  
	 conn.arret(e.getMessage());
	 
 }


*/

    
    
    
    
		
	
	}
    			
    
}