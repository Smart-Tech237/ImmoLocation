package controleur;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;


import model.*;

public class LocataireBdController {
	static ConnexionBD conn = new ConnexionBD();
	
	public static void enregistrement(Locataire obj) {
		String res = "INSERT INTO Locataire VALUES ("+obj.getNumeroCNI()+",'"+obj.getNom()+"','"+obj.getPrenom()+"',"+obj.getTelephone()+",'"+obj.getMetier()+"')";;
		
		int t = conn.update(res);
		
	}
	
	public static ArrayList<Locataire> afficherTousLesLocataire(ResultSet resultat) {
		
		ArrayList<Locataire> tab = new ArrayList();
		String t[] = new String[5];
		  try {
		         ResultSetMetaData rsmd = resultat.getMetaData();
		         int nbCols = rsmd.getColumnCount();
		         boolean encore = resultat.next();

		         while (encore) {

		            for (int i = 1; i <= nbCols; i++) {
		              t[i-1] = (resultat.getString(i));
		              
		            }
		            Locataire obj = new Locataire();
		              obj.setNumeroCNI(Integer.parseInt(t[0]));
			          obj.setNom(t[1]);
			          obj.setPrenom(t[2]);
			          obj.setTelephone(Integer.parseInt(t[3]));
			          obj.setMetier(t[4]);
			          tab.add(obj);
					  encore = resultat.next();
		         }
		         
		         resultat.close();
		      } catch (SQLException e) {
		         ConnexionBD.arret(e.getMessage());
		      }
		  
		  return tab;
	  }
	
}





