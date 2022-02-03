package controleur;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Table;

import controleur.ConnexionBD;
import model.*;

public class ProprieteBdController {

static ConnexionBD conn = new ConnexionBD();

	public static void enregistrement(Propriete obj) {
		String res = "INSERT INTO Propriete VALUES ("+obj.getId()+","+obj.getType()+","+obj.getPrix()+",'"+obj.getDescription()+"','"+obj.getLocalisation()+"',"+obj.getStatut()+")";
		
		int t = conn.update(res);
		
	}
	public ArrayList<Propriete> proprieteLibre(ResultSet resultat) {
		ArrayList<Propriete> tab = new ArrayList();
		String t[] = new String[6];
		  try {
		         ResultSetMetaData rsmd = resultat.getMetaData();
		         int nbCols = rsmd.getColumnCount();
		         boolean encore = resultat.next();

		         while (encore) {

		            for (int i = 1; i <= nbCols; i++) {
		              t[i-1] = (resultat.getString(i));
		              
		            }
		            
		            //construction de l'objet selon le type selectionn�
		            if(Integer.parseInt(t[1])==1) {
		           Propriete obj = new Maison();
		              obj.setType(Integer.parseInt(t[1]));
		              obj.setPrix(Integer.parseInt(t[2]));
			          obj.setDescription(t[3]);
			          obj.setLocalisation(t[4]);
			          obj.setStatut(Integer.parseInt(t[5]));
			          tab.add(obj);
					  encore = resultat.next();
		            }
		            else if(Integer.parseInt(t[1])==2) {
				           Propriete obj = new Boutique();
				              obj.setType(Integer.parseInt(t[1]));
				              obj.setPrix(Integer.parseInt(t[2]));
					          obj.setDescription(t[3]);
					          obj.setLocalisation(t[4]);
					          obj.setStatut(Integer.parseInt(t[5]));
					          tab.add(obj);
							  encore = resultat.next();
				            }
		        
		         }
		         
		         resultat.close();
		      } catch (SQLException e) {
		         ConnexionBD.arret(e.getMessage());
		      }
		  
		  return tab;
	  }
		
	
	public static ArrayList<Propriete> afficherToutesLesProprietes(ResultSet resultat) {
		
		ArrayList<Propriete> tab = new ArrayList();
		String t[] = new String[6];
		  try {
		         ResultSetMetaData rsmd = resultat.getMetaData();
		         int nbCols = rsmd.getColumnCount();
		         boolean encore = resultat.next();

		         while (encore) {

		            for (int i = 1; i <= nbCols; i++) {
		              t[i-1] = (resultat.getString(i));
		              
		            }
		            
		            //construction de l'objet selon le type selectionn�
		            if(Integer.parseInt(t[1])==1) {
		           Propriete obj = new Maison();
		              obj.setType(Integer.parseInt(t[1]));
		              obj.setPrix(Integer.parseInt(t[2]));
			          obj.setDescription(t[3]);
			          obj.setLocalisation(t[4]);
			          obj.setStatut(Integer.parseInt(t[5]));
			          tab.add(obj);
					  encore = resultat.next();
		            }
		            else if(Integer.parseInt(t[1])==2) {
				           Propriete obj = new Boutique();
				              obj.setType(Integer.parseInt(t[1]));
				              obj.setPrix(Integer.parseInt(t[2]));
					          obj.setDescription(t[3]);
					          obj.setLocalisation(t[4]);
					          obj.setStatut(Integer.parseInt(t[5]));
					          tab.add(obj);
							  encore = resultat.next();
				            }
		        
		         }
		         
		         resultat.close();
		      } catch (SQLException e) {
		         ConnexionBD.arret(e.getMessage());
		      }
		  
		  return tab;
	  }
	

}
