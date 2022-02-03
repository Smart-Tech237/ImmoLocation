package model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import controleur.ConnexionBD;

	
public class Facture {

	private int idLocataire;
	private int typePropriete;
	private int caution;
	private int dureeContrat;
	
	
	public Facture() {
		
	}
	public Facture(int idLocataire, int typePropriete, int caution, int dureeContrat) {
		
		this.idLocataire = idLocataire;
		this.typePropriete = typePropriete;
		this.caution = caution;
		this.dureeContrat = dureeContrat;
	}
	
	public int getIdLocataire() {
		return idLocataire;
	}
	public void setIdLocataire(int idLocataire) {
		this.idLocataire = idLocataire;
	}
	public int getTypePropriete() {
		return typePropriete;
	}
	public void setTypePropriete(int typePropriete) {
		this.typePropriete = typePropriete;
	}
	public int getCaution() {
		return caution;
	}
	public void setCaution(int caution) {
		this.caution = caution;
	}
	public int getDureeContrat() {
		return dureeContrat;
	}
	public void setDureeContrat(int dureeContrat) {
		this.dureeContrat = dureeContrat;
	} 
	public int calculMontant(int montant) {
		montant = montant*dureeContrat;
		return montant;
	}

}
