package controleur;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import model.Authentification;


public class AthentificationBdController {
	
	static ConnexionBD con = new ConnexionBD();

	public static ResultSet selectAuthentification(){
		String requete ="SELECT * FROM Authentification";
		ResultSet res = con.select(requete);
		return res;
	}
	
	public static Authentification infoLogin(ResultSet resultat) {
		/* Cette fonction retourne les information de connexion:
		 * @user_name et @pwd
		 * sous forme d'objet de type Authentification
		 */
		String t[] = new String[2]; // tab qui nous permet de stoker les donnees de la requete
		
		
		  try {
				ResultSetMetaData rsmd = resultat.getMetaData();
				int nbCols = rsmd.getColumnCount();
				boolean encore = resultat.next();
	
				while (encore) {
				  //lecture du resultat et ajout dans le tableau t
					for (int i = 1; i <= nbCols; i++) {
					  t[i-1] = (resultat.getString(i));
					}
	
				encore = resultat.next();
				 }   
				 resultat.close();
			  } catch (SQLException e) {
				 ConnexionBD.arret(e.getMessage());
			  }
		// instantiation de l'objet 
		  Authentification obj = new Authentification(t[0], t[1]);
		  
		  return obj;
		  
	}

}
	






