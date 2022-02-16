package vue;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import controleur.ConnexionBD;
import controleur.ProprieteBdController;
import model.Propriete;

public class ChargementBD {
	private String[] data= {};
	private String statut;
	public  String[] getData() {
		return this.data;
	}
	  public String[] chargementTabPropriete(){
	      
			ProprieteBdController p=new ProprieteBdController();
			ArrayList<Propriete> a=new ArrayList<Propriete>();
			ConnexionBD conn=new ConnexionBD();
			String requete="SELECT * FROM propriete";

			ResultSet result=conn.select(requete);
				a=p.afficherToutesLesProprietes(result);
				for(Propriete prop:a) {
					String proprieteType = null;
					
					if(prop.getType()==1) {
					 proprieteType="maison";
					}
					else if(prop.getType()==2) {
						proprieteType="boutique";
					}
					if(prop.getStatut()==1) {
						this.statut="OCCUPEE";
					}
					else{
						this.statut="DISPONIBLE";
					}
					String [] donnee = {proprieteType,String.valueOf(prop.getPrix()),
							prop.getDescription(),prop.getLocalisation(),this.statut};
					this.data=donnee;
				}
				return this.data;
				
			}
}
