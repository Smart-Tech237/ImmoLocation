package controleur;


import java.sql.SQLException;

import model.Locataire;
import model.Propriete;

public class LocationController {
	private boolean reussit=false;
	ConnexionBD conn=new ConnexionBD();
	
	/*
	 * les etapes de l'assignation
	 * 1-recuperation de l'id du locataire
	 * 2-recuperation de l'id de la propriete
	 * 3-enregistrer ces id dans la table location
	 * 4-changer le statut de la propriete louer et le faire passer a occupe
	 */
	
	public boolean assigner(Locataire loc,Propriete prop) {//enregistrement en bd des donnees locataire assignée
		
	//	a.enregistrement(loc);//vue que l'assignation est géré par le bouton ajouté de locataire,nous ajoutons un locataire directement ici
		
		String sql="INSERT INTO `location`( cni_locataire, id_propriete) VALUES ('"+loc.getNumeroCNI()+"','"+prop.getId()+"')";
		int t=conn.update(sql);
		String sql2="UPDATE `propriete` SET status="+1+" WHERE id_propriete="+prop.getId()+"";//1 c est pour changer le statut occupé
		conn.update(sql2);
		this.reussit=true;
		System.out.println("le id est : "+prop.getId());
		return this.reussit;
	}

}
