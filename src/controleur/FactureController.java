package controleur;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import model.*;

import model.Facture;

public class FactureController {	
	
	
// insertion dans la base de donnee
public void enregistrement(Facture fact) {
	String query = "INSERT INTO `facture`(`idLocataire`, `typePropriete`, `caution`, `dure_contrat`) VALUES ('"+fact.getIdLocataire()+"','"+fact.getTypePropriete()+"','"+fact.getCaution()+"','"+fact.getDureeContrat()+"')";
	ConnexionBD conn=new ConnexionBD();
	int q = conn.update(query); 
}
////////////////////////// Affichage des informations sur la facture //////////////////////
//// les informations sur l'id du locataire doivent etre celle qui sont deja dans la base de donnee
//// actulement : 14523, 120368, sont les id des locataires dans notre base de donnee 

public static ArrayList<Facture> afficherToutesLesFactures(ResultSet resultat){
	ArrayList<Facture> tab = new ArrayList();
	
	String g[] = new String [4];
	
	try {
		ResultSetMetaData rsmd = resultat.getMetaData();
		int nbCols = rsmd.getColumnCount();
		boolean encore = resultat.next();

		while (encore) {

		   for (int i = 1; i <= nbCols; i++) {
			 g[i-1] = (resultat.getString(i));
			 
		   }


	 Facture fact = new Facture();
	 fact.setIdLocataire(Integer.parseInt(g[0]));  
	 fact.setTypePropriete(Integer.parseInt(g[1]));
	 fact.setCaution(Integer.parseInt(g[2]));
	 fact.setDureeContrat(Integer.parseInt(g[3]));
	 tab.add(fact);
	 encore = resultat.next();
		}
		resultat.close();
	}  catch (SQLException e) {
		ConnexionBD.arret(e.getMessage());
	 }
	return tab;
}

}
