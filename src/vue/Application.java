package vue;



import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controleur.*;
import model.*;
;



public class Application extends javax.swing.JFrame {
	private String[] data;
	ConnexionBD conn = new ConnexionBD();
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form APPLICATION
     */
    public Application() {
        initComponents();
        
        //1111111111111111111111111111111111111111111111111111chargement des donnees propriete de la base de donne dans le table model
        DefaultTableModel tbmodel = (DefaultTableModel)propriete_table.getModel();
		ProprieteBdController p=new ProprieteBdController();
		ArrayList<Propriete> a=new ArrayList<Propriete>();
		ConnexionBD conn=new ConnexionBD();
		String requete="SELECT * FROM propriete";

		ResultSet result=conn.select(requete);
			a=p.afficherToutesLesProprietes(result);
			for(Propriete prop:a) {
				String proprieteType = null;
				String statut=null;
				if(prop.getType()==1) {
				 proprieteType="maison";
				}
				else if(prop.getType()==2) {
					proprieteType="boutique";
				}
				if(prop.getStatut()==1) {
					statut="OCCUPEE";
				}
				else{
					statut="DISPONIBLE";
				}
				String data[]= {proprieteType,String.valueOf(prop.getPrix()),
						prop.getDescription(),prop.getLocalisation(),statut};
				

   
    tbmodel.addRow(data);}
			
			//22222222222222222222222222222222222222222222222chargement des donnees locataire de la base de bs
			DefaultTableModel tbmodel_LO = (DefaultTableModel)locataire_table .getModel();
	        
			ResultSet resultats = conn.select("SELECT * FROM Locataire");
	    	ArrayList<Locataire> r = new ArrayList<Locataire>();
			r = LocataireBdController.afficherTousLesLocataire(resultats);
			for(Locataire l: r) {
				l.afficher();
				String data2[]= { String.valueOf(l.getNumeroCNI()), l.getNom(),
	         			l.getPrenom(), String.valueOf(l.getTelephone()),
	         			l.getMetier()};
				tbmodel_LO.addRow(data2);
	        
			}
			
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    
    
    private void initComponents() {
    	
    	/////////////////////////////creation elements accueil
   	
    		JLabel jLabel_A_motbienv = new javax.swing.JLabel();
           panneau_accuiel = new javax.swing.JPanel();
           jButton_facture = new javax.swing.JButton("facture");
           jButton_proprietes = new javax.swing.JButton("propretes");
           jButton_locataire = new javax.swing.JButton("locataire");
           button_quiterSysteme = new javax.swing.JButton("Quitter");
           jLabel_A_logo = new javax.swing.JLabel();
           
           label_A_gest_lo = new javax.swing.JLabel();
           jLabel_A_quitter = new javax.swing.JLabel();
           jLabel_A_GES_PRO = new javax.swing.JLabel();
           label_A_facture = new javax.swing.JLabel();


    	/////////////////////// creation d'elements factures/////////////////
    	
        Panel_principal = new javax.swing.JPanel();
        
        Panel_Facturation = new javax.swing.JPanel();
        pannel_titre_Facturation = new javax.swing.JPanel();
        gestion_de_fac_label = new javax.swing.JLabel();
        controlleur_De_panels2 = new javax.swing.JPanel();
        Button_proprietes_f = new javax.swing.JButton();
        Button_Locataire_f = new javax.swing.JButton();
        boutton_Facturation_f = new javax.swing.JButton();
        Button_retour_fac_acc = new javax.swing.JButton();
        pane_de_champ_proprietes = new javax.swing.JPanel();
        Id_loc_label = new javax.swing.JLabel();
        type_pro_Label = new javax.swing.JLabel();
        cautionlabel = new javax.swing.JLabel();
        localisationlabel3 = new javax.swing.JLabel();
        numero_de_cni_TextField1 = new javax.swing.JTextField();
        nom_TextField1 = new javax.swing.JTextField();
        prenom_TextField1 = new javax.swing.JTextField();
        telephone_Textfield1 = new javax.swing.JTextField();
        boutton_enregistrer = new javax.swing.JButton();
        titre_champs_f = new javax.swing.JLabel();
        pane_de_la_table2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Facture_table = new javax.swing.JTable();

      proprietes_libre = new javax.swing.JLabel("Proprietes libres");
       proprietes_libre_combo= new JComboBox<String> ();

        JLabel proprietes_libre= new javax.swing.JLabel("Proprietes libres");        
        proprietes_libre_combo= new JComboBox<String> ();

       
        
        ///////////////creation  elements proprietes/////////////////////////////
        
        Panel_Proprietes = new javax.swing.JPanel();
        pannel_tire_proprietes = new javax.swing.JPanel();
        gestion_pro_label = new javax.swing.JLabel();
        controlleur_De_panels3 = new javax.swing.JPanel();
        Button_proprietes_p = new javax.swing.JButton();
        Button_Locataire_p = new javax.swing.JButton();
        Facturation_p = new javax.swing.JButton();
        Button_retour_pro_acc = new javax.swing.JButton();
        pane_de_champ1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descrition_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        typedeprorpriete_combo = new JComboBox<String>();
        prix_mensuel_textfield = new javax.swing.JTextField();
        description_textArea = new javax.swing.JTextArea();
        localisation_textfield = new javax.swing.JTextField();
        statut_textfield = new javax.swing.JTextField();
        button_ajouter_P = new javax.swing.JButton();
        buttuon_Modifier_p = new javax.swing.JButton();
        button_supprimer_p = new javax.swing.JButton();
        propriete_label = new javax.swing.JLabel();
        pane_de_la_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        propriete_table = new javax.swing.JTable();
        
      
        
        
        /////////////////////// elements locataires/////////////////////////////////
        
        Panel_Locataire = new javax.swing.JPanel();
        pannel_titre_de_facture = new javax.swing.JPanel();
        gestion_locataireslabel = new javax.swing.JLabel();
        controlleur_De_panels4 = new javax.swing.JPanel();
        Button_proprietes_l = new javax.swing.JButton();
        Button_Locataire_l = new javax.swing.JButton();
        Facturation_l = new javax.swing.JButton();
        Button_retour_loc_acc = new javax.swing.JButton();
        pane_de_locataire = new javax.swing.JPanel();
        ncniLabel = new javax.swing.JLabel();
        nomLabel = new javax.swing.JLabel();
        PrenomLabel = new javax.swing.JLabel();
        professionLabel = new javax.swing.JLabel();
        localisationlabel2 = new javax.swing.JLabel();
        numero_de_cni_TextField = new javax.swing.JTextField();
        nom_TextField = new javax.swing.JTextField();
        prenom_TextField = new javax.swing.JTextField();
        telephone_Textfield = new javax.swing.JTextField();
        profession_textfield = new javax.swing.JTextField();
        button_ajouter_L = new javax.swing.JButton();
        buttuon_Modifier_L = new javax.swing.JButton();
        button_supprimer_L = new javax.swing.JButton();
        gestion_de_locatairelabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        locataire_table = new javax.swing.JTable();
        
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_principal.setLayout(new java.awt.CardLayout());
        
        
        ////////////////////////////++++++++++++++++++++++++++++pannaueaccueil+++++++++++++++++++++++++++++++++++++//////////////////////////////////////

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panneau_accuiel);
        panneau_accuiel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panneau_accuiel.setBackground(new java.awt.Color(51, 0, 51));
        panneau_accuiel.setLayout(new java.awt.GridBagLayout());

        jButton_facture.setIcon(new javax.swing.ImageIcon("images/facture_t.png")); // NOI18N
        jButton_facture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_factureActionPerformed(evt);
            }
            
        });
        java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 139, 0, 0);
        panneau_accuiel.add(jButton_facture, gridBagConstraints);

        jButton_proprietes.setIcon(new javax.swing.ImageIcon("images/proprietes_t.png")); // NOI18N
        jButton_proprietes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_proprietesActionPerformed(evt);
            }//////////////////////////////////////////////////////////////////////////////////
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 130, 0, 0);
        panneau_accuiel.add(jButton_proprietes, gridBagConstraints);

        jButton_locataire.setBackground(new java.awt.Color(255,255, 255));
        jButton_locataire.setIcon(new javax.swing.ImageIcon("images/locataire_t.png")); // NOI18N
       // jButton_locataire.setForeground(Color.white);
        jButton_locataire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_locataireActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 109, 0, 0);
        panneau_accuiel.add(jButton_locataire, gridBagConstraints);

        button_quiterSysteme.setIcon(new javax.swing.ImageIcon("images/quitter_t.png")); // NOI18N
        button_quiterSysteme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_quiterSystemeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 100, 0, 0);
        panneau_accuiel.add(button_quiterSysteme, gridBagConstraints);

        jLabel_A_logo.setIcon(new javax.swing.ImageIcon("images/logo_app.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(18, 62, 0, 0);
        panneau_accuiel.add(jLabel_A_motbienv, gridBagConstraints);

        jLabel_A_motbienv.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_A_motbienv.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_A_motbienv.setText("YOU ARE ALWAYS WELCOME ON IMMOLOCATION");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(36, 159, 0, 104);
        panneau_accuiel.add(jLabel_A_logo, gridBagConstraints);

        label_A_gest_lo.setForeground(new java.awt.Color(255, 255, 255));
        label_A_gest_lo.setText("Gestion de locataires");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 119, 51, 0);
        panneau_accuiel.add(label_A_gest_lo, gridBagConstraints);

        jLabel_A_quitter.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_A_quitter.setText("Quitter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 149, 51, 0);
        panneau_accuiel.add(jLabel_A_quitter, gridBagConstraints);

        jLabel_A_GES_PRO.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_A_GES_PRO.setText("Gestion de proprietes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 142, 51, 0);
        panneau_accuiel.add(jLabel_A_GES_PRO, gridBagConstraints);

        label_A_facture.setForeground(new java.awt.Color(255, 255, 255));
        label_A_facture.setText("Facturations");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 156, 51, 0);
        panneau_accuiel.add(label_A_facture, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panneau_accuiel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panneau_accuiel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel_principal.add(panneau_accuiel, "card1");
    
 /////////panneau facturation//////////////////////////////////////////////////////////////////////////////////
        
        pannel_titre_Facturation.setBackground(new java.awt.Color(51, 0, 51));

        gestion_de_fac_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        gestion_de_fac_label.setForeground(new java.awt.Color(255, 255, 255));
        gestion_de_fac_label.setText("FACTURATION");

        javax.swing.GroupLayout pannel_titre_FacturationLayout = new javax.swing.GroupLayout(pannel_titre_Facturation);
        pannel_titre_Facturation.setLayout(pannel_titre_FacturationLayout);
        pannel_titre_FacturationLayout.setHorizontalGroup(
            pannel_titre_FacturationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_titre_FacturationLayout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(gestion_de_fac_label, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );
        pannel_titre_FacturationLayout.setVerticalGroup(
            pannel_titre_FacturationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_titre_FacturationLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(gestion_de_fac_label, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        ////////////////////controleur panneau facturation//////////////////
        
        controlleur_De_panels2.setBackground(new java.awt.Color(255, 51, 51));

        Button_proprietes_f.setText("Proprietes");
        Button_proprietes_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_proprietes_fActionPerformed(evt);
            }
        });

        Button_Locataire_f.setText("Locataire");
        Button_Locataire_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Locataire_fActionPerformed(evt);
            }
        });

        boutton_Facturation_f.setText("Facturation");
        boutton_Facturation_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_Facturation_fActionPerformed(evt);
            }
        });

        Button_retour_fac_acc.setText("Retour");
        
        
        Button_retour_fac_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	retour(evt);
            }
        });
        

        javax.swing.GroupLayout controlleur_De_panels2Layout = new javax.swing.GroupLayout(controlleur_De_panels2);
        controlleur_De_panels2.setLayout(controlleur_De_panels2Layout);
        controlleur_De_panels2Layout.setHorizontalGroup(
            controlleur_De_panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlleur_De_panels2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(controlleur_De_panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlleur_De_panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Button_Locataire_f)
                        .addComponent(Button_proprietes_f))
                    .addGroup(controlleur_De_panels2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(boutton_Facturation_f))
                    .addComponent(Button_retour_fac_acc))
                .addGap(30, 30, 30))
        );
        controlleur_De_panels2Layout.setVerticalGroup(
            controlleur_De_panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlleur_De_panels2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(Button_proprietes_f)
                .addGap(59, 59, 59)
                .addComponent(Button_Locataire_f)
                .addGap(65, 65, 65)
                .addComponent(boutton_Facturation_f)
                .addGap(63, 63, 63)
                .addComponent(Button_retour_fac_acc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pane_de_champ_proprietes.setBackground(new java.awt.Color(255, 255, 255));

        Id_loc_label.setText("Identifiant du locataire:");

        type_pro_Label.setText("Type de propriete");

        cautionlabel.setText("Caution");

        localisationlabel3.setText("Duree du contrat");

        numero_de_cni_TextField1.setForeground(new java.awt.Color(0, 0, 0));

        nom_TextField1.setForeground(new java.awt.Color(0, 0, 0));
        

        prenom_TextField1.setForeground(new java.awt.Color(0, 0, 0));

        telephone_Textfield1.setForeground(new java.awt.Color(0, 0, 0));

        boutton_enregistrer.setText("ENREGISTRER");
        
        
        
/////////////////////////////////////AJOUTER avec le boutton enregitrer de facture//////////////////////////////////////////
        
        
        
        boutton_enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
        
         //insertion d'une facture en base de donnée
         
         Facture fact = new Facture(Integer.parseInt(numero_de_cni_TextField.getText()),
        		 
        		 Integer.parseInt( nom_TextField1.getText()),Integer.parseInt(prenom_TextField1.getText()),
        		 
        		 Integer.parseInt(telephone_Textfield1.getText()));
         
         FactureController fc = new FactureController();
         
         fc.enregistrement(fact);
         
     	 String data[]= {  numero_de_cni_TextField1.getText(), nom_TextField1.getText(),prenom_TextField1.getText(),telephone_Textfield1.getText()
            	    };//affichage direct sur le jtable
      
         
         DefaultTableModel tbmodel = (DefaultTableModel)Facture_table.getModel();
         tbmodel.addRow(data);
            
         numero_de_cni_TextField1.setText("");
         nom_TextField1.setText("");
         prenom_TextField1.setText("");
         telephone_Textfield1.setText("");
    	   

            }});
        

        titre_champs_f.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titre_champs_f.setForeground(new java.awt.Color(255, 51, 51));
        titre_champs_f.setText("FACTURE");

        javax.swing.GroupLayout pane_de_champ3Layout = new javax.swing.GroupLayout(pane_de_champ_proprietes);
        pane_de_champ_proprietes.setLayout(pane_de_champ3Layout);
        pane_de_champ3Layout.setHorizontalGroup(
            pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_de_champ3Layout.createSequentialGroup()
                .addGroup(pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_de_champ3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titre_champs_f))
                    .addGroup(pane_de_champ3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Id_loc_label, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(localisationlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type_pro_Label)
                            .addComponent(cautionlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boutton_enregistrer)
                            .addGroup(pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nom_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numero_de_cni_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prenom_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telephone_Textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pane_de_champ3Layout.setVerticalGroup(
            pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_de_champ3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titre_champs_f)
                .addGap(27, 27, 27)
                .addGroup(pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_loc_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero_de_cni_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type_pro_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_de_champ3Layout.createSequentialGroup()
                        .addComponent(cautionlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(406, 406, 406))
                    .addGroup(pane_de_champ3Layout.createSequentialGroup()
                        .addComponent(prenom_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pane_de_champ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telephone_Textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(localisationlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(boutton_enregistrer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        
        
/////////////////////////////////////// creation du jtable_facture/////////////////////////////////////
        
        
        Facture_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               
                
            },
            new String [] {
                "Identifiant du loc", "Type de propriete", "Caution", "Duree du contrat"
            }
        ));
        jScrollPane3.setViewportView(Facture_table);

       
        javax.swing.GroupLayout pane_de_la_table2Layout = new javax.swing.GroupLayout(pane_de_la_table2);
        pane_de_la_table2.setLayout(pane_de_la_table2Layout);
        pane_de_la_table2Layout.setHorizontalGroup(
            pane_de_la_table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        pane_de_la_table2Layout.setVerticalGroup(
            pane_de_la_table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        javax.swing.GroupLayout Panel_FacturationLayout = new javax.swing.GroupLayout(Panel_Facturation);
        Panel_Facturation.setLayout(Panel_FacturationLayout);
        Panel_FacturationLayout.setHorizontalGroup(
            Panel_FacturationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FacturationLayout.createSequentialGroup()
                .addGroup(Panel_FacturationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pannel_titre_Facturation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_FacturationLayout.createSequentialGroup()
                        .addComponent(controlleur_De_panels2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pane_de_champ_proprietes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pane_de_la_table2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        Panel_FacturationLayout.setVerticalGroup(
            Panel_FacturationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FacturationLayout.createSequentialGroup()
                .addComponent(pannel_titre_Facturation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_FacturationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controlleur_De_panels2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pane_de_la_table2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_FacturationLayout.createSequentialGroup()
                        .addComponent(pane_de_champ_proprietes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        Panel_principal.add(Panel_Facturation, "card2");
        
        //3222222222222222222222222222222222222222222222222222_Panneau gestion de propietes_2222222222222222222222222222222222222222222222222222222//
        

        pannel_tire_proprietes.setBackground(new java.awt.Color(51, 0, 51));

        gestion_pro_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        gestion_pro_label.setForeground(new java.awt.Color(255, 255, 255));
        gestion_pro_label.setText("Gestion de proprietes");

        javax.swing.GroupLayout pannel_titre_Facturation1Layout = new javax.swing.GroupLayout(pannel_tire_proprietes);
        pannel_tire_proprietes.setLayout(pannel_titre_Facturation1Layout);
        pannel_titre_Facturation1Layout.setHorizontalGroup(
            pannel_titre_Facturation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_titre_Facturation1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(gestion_pro_label, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );
        pannel_titre_Facturation1Layout.setVerticalGroup(
            pannel_titre_Facturation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_titre_Facturation1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(gestion_pro_label, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        controlleur_De_panels3.setBackground(new java.awt.Color(255, 51, 51));

        Button_proprietes_p.setText("Proprietes");
        Button_proprietes_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_proprietes_pActionPerformed(evt);
            }
        });

        Button_Locataire_p.setText("Locataire");
        Button_Locataire_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Locataire_pActionPerformed(evt);
            }
        });

        Facturation_p.setText("Facturation");
        Facturation_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Facturation_pActionPerformed(evt);
            }
        });

      //  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&77
        
        Button_retour_pro_acc.setText("Retour");
        
        Button_retour_pro_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	retour(evt);
            }
        });

        javax.swing.GroupLayout controlleur_De_panels3Layout = new javax.swing.GroupLayout(controlleur_De_panels3);
        controlleur_De_panels3.setLayout(controlleur_De_panels3Layout);
        controlleur_De_panels3Layout.setHorizontalGroup(
            controlleur_De_panels3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlleur_De_panels3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
       
                .addGroup(controlleur_De_panels3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlleur_De_panels3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Button_Locataire_p)
                        .addComponent(Button_proprietes_p))
                    .addGroup(controlleur_De_panels3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Facturation_p))
                    .addComponent(Button_retour_pro_acc))
                .addGap(30, 30, 30))
        );
        controlleur_De_panels3Layout.setVerticalGroup(
            controlleur_De_panels3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlleur_De_panels3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(Button_proprietes_p)
                .addGap(59, 59, 59)
                .addComponent(Button_Locataire_p)
                .addGap(65, 65, 65)
                .addComponent(Facturation_p)
                .addGap(63, 63, 63)
                .addComponent(Button_retour_pro_acc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        
      //pannaue champs proprietes
        
        String elements[]= {"Maison","Boutique"};
        
        typedeprorpriete_combo= new JComboBox<String>(elements);
        
        pane_de_champ1.setBackground(new java.awt.Color(255, 255, 255));
       jLabel2.setText("Type de propriete:");

        jLabel3.setText("Prix mensuel:");

        descrition_label.setText("description");

        jLabel5.setText("Qualites");

        jLabel6.setText("Localisation");

        typedeprorpriete_combo.setForeground(new java.awt.Color(0,0,0));

        prix_mensuel_textfield.setForeground(new java.awt.Color(0,0,0));

        description_textArea.setForeground(new java.awt.Color(0,0,0));

        localisation_textfield.setForeground(new java.awt.Color(0,0,0));

        statut_textfield.setForeground(new java.awt.Color(0,0,0));

        
        
//////////////////////////////ajouter propriete avec le boutton ajouter_p/////////////////////////////////////////////////////////////////
        
        button_ajouter_P.setText("Ajouter");
    button_ajouter_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	// test si les champs sont vides
            	
            	
            	if( prix_mensuel_textfield.getText().isEmpty()||
            	description_textArea.getText().isEmpty() ||localisation_textfield.getText().isEmpty()||
            	statut_textfield.getText().isEmpty()) { 
            		
           JOptionPane.showMessageDialog(null,"veuillez remplir tous les champs","ERREUR", JOptionPane.ERROR_MESSAGE);

            	}
            	else {
      
            		//ajout en bd
            		
            		
            		if(typedeprorpriete_combo.getSelectedItem().toString().equals("Maison")) {
            			
            			Propriete prop = new Propriete(1,Integer.parseInt(prix_mensuel_textfield.getText()),
                				
                										description_textArea.getText(),localisation_textfield.getText(),
                										
                										Integer.parseInt(statut_textfield.getText()));
                		
                		ProprieteBdController.enregistrement(prop);
                		
                		
            			
            		}
            		
            		else if(typedeprorpriete_combo.getSelectedItem().toString().equals("Boutique"))
            		{
            			Propriete prop = new Propriete(2,Integer.parseInt(prix_mensuel_textfield.getText()),
                				
                									   description_textArea.getText(),localisation_textfield.getText(),
                									   
                									   2);
                		
                		ProprieteBdController.enregistrement(prop);
            			
            		}
            	
            		DefaultTableModel tbmodel = (DefaultTableModel)propriete_table.getModel();

            			 String data1[]= { typedeprorpriete_combo.getSelectedItem().toString(), prix_mensuel_textfield.getText(),
                    		
            					 description_textArea.getText(),localisation_textfield.getText(),"DISPONIBLE"};
            			 
            			 		 tbmodel.addRow(data1);
            			
            	
                   
                   
                   
                       	
                   button_ajouter_P.setText("Ajouter");
                   

            		String type=elements[0].toString();
            		System.out.println(type);
            		
                button_ajouter_P.setText("Ajouter");

           		prix_mensuel_textfield.setText("");
               	description_textArea.setText("");
           		localisation_textfield.setText("");
               	statut_textfield.setText("");
        
        
            	}
            	
        	}});
/////////////////////////modifier propriete avec le boutton modifier_p//////////////////////////////////////////////////////////////////////
        

        buttuon_Modifier_p.setText("Modifier");
        
        buttuon_Modifier_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         	   DefaultTableModel tbmodel = (DefaultTableModel)propriete_table.getModel();
         	   
         	  int i=locataire_table.getSelectedRow();
         	  if(i<=-1) {
         		 JOptionPane.showMessageDialog(null,"veuillez selectionner une ligne du champs a modifier " ,"ERREUR", JOptionPane.ERROR_MESSAGE);
         	  }
         	  else
         	  {
         tbmodel.setValueAt(typedeprorpriete_combo.getSelectedItem(),i,0);
      tbmodel.setValueAt(prix_mensuel_textfield.getText(),i,1);
      tbmodel.setValueAt( description_textArea.getText(),i,2);
      tbmodel.setValueAt(localisation_textfield.getText(),i,3);
      tbmodel.setValueAt(statut_textfield.getText(),i,4);
      
         	  }
    	   
         	  
            }});

        
        propriete_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked_pro(evt);
            }
        });

        
         
         
 /////////////////////////////suprimer proprietes avec le boutton supprimer/////////////////////////////////////////////////////////////////      
        

       button_supprimer_p.setText("Supprimer");
       
      
       button_supprimer_p.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
            	   DefaultTableModel tbmodel = (DefaultTableModel)propriete_table.getModel();
            	   
            	   int i=propriete_table.getSelectedRow();
            	   if(i<0) {
               		 JOptionPane.showMessageDialog(null,"veuillez selectionner une ligne du champs a supprimer " ,"ERREUR", JOptionPane.ERROR_MESSAGE);
               	  }
               	  else
               	  {
               	   
               		  
            	   tbmodel.removeRow(i);
               	  } }});
        propriete_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        propriete_label.setForeground(new java.awt.Color(255, 51, 51));
        propriete_label.setText("PROPRIETES");

        javax.swing.GroupLayout pane_de_champ1Layout = new javax.swing.GroupLayout(pane_de_champ1);
        pane_de_champ1.setLayout(pane_de_champ1Layout);
        pane_de_champ1Layout.setHorizontalGroup(
            pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_de_champ1Layout.createSequentialGroup()
                .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_de_champ1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                .addComponent(descrition_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_ajouter_P))
                        .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pane_de_champ1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(typedeprorpriete_combo, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                            .addComponent(prix_mensuel_textfield)
                                            .addComponent(localisation_textfield))
                                        .addComponent(description_textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(statut_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pane_de_champ1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(buttuon_Modifier_p)
                                .addGap(30, 30, 30)
                                .addComponent(button_supprimer_p))))
                    .addGroup(pane_de_champ1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(propriete_label)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pane_de_champ1Layout.setVerticalGroup(
            pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_de_champ1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(propriete_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typedeprorpriete_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prix_mensuel_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    
                    .addComponent(localisation_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statut_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(description_textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descrition_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(pane_de_champ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_ajouter_P)
                    .addComponent(buttuon_Modifier_p)
                    .addComponent(button_supprimer_p))
                .addGap(190, 190, 190))
        );

        javax.swing.GroupLayout pane_de_la_tableLayout = new javax.swing.GroupLayout(pane_de_la_table);
        pane_de_la_table.setLayout(pane_de_la_tableLayout);
        pane_de_la_tableLayout.setHorizontalGroup(
            pane_de_la_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        pane_de_la_tableLayout.setVerticalGroup(
            pane_de_la_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        //////////////////////////////////// creation de jtable_propriete/////////////////////////////////////////////////
        
        
        propriete_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
 
                "Type de proprietes", "Prix mensuel_", "description", "Localisation", "Qualite","occupant"
            }
        ));
        jScrollPane1.setViewportView(propriete_table);
        if (propriete_table.getColumnModel().getColumnCount() > 0) {
            propriete_table.getColumnModel().getColumn(5).setHeaderValue("occupant");

        }

        javax.swing.GroupLayout Panel_ProprietesLayout = new javax.swing.GroupLayout(Panel_Proprietes);
        Panel_Proprietes.setLayout(Panel_ProprietesLayout);
        Panel_ProprietesLayout.setHorizontalGroup(
            Panel_ProprietesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel_tire_proprietes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_ProprietesLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(controlleur_De_panels3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pane_de_champ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(Panel_ProprietesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_ProprietesLayout.createSequentialGroup()
                    .addGap(199, 199, 199)
                    .addComponent(pane_de_la_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(538, Short.MAX_VALUE)))
        );
        Panel_ProprietesLayout.setVerticalGroup(
            Panel_ProprietesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProprietesLayout.createSequentialGroup()
                .addComponent(pannel_tire_proprietes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ProprietesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane_de_champ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(controlleur_De_panels3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(Panel_ProprietesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_ProprietesLayout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(pane_de_la_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(145, Short.MAX_VALUE)))
        );

        Panel_principal.add(Panel_Proprietes, "card3");
        
  // 333333333333333333333333333333333333333333333333333_panneau gestion de LOCATAIRE_333333333333333333333333333333333333333333333333333333333333333
        

        pannel_titre_de_facture.setBackground(new java.awt.Color(51, 0, 51));

        gestion_locataireslabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        gestion_locataireslabel.setForeground(new java.awt.Color(255, 255, 255));
        gestion_locataireslabel.setText("Gestion de locataire");

        javax.swing.GroupLayout pannel_titre_Facturation2Layout = new javax.swing.GroupLayout(pannel_titre_de_facture);
        
        pannel_titre_de_facture.setLayout(pannel_titre_Facturation2Layout);
        pannel_titre_Facturation2Layout.setHorizontalGroup(
            pannel_titre_Facturation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_titre_Facturation2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(gestion_locataireslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannel_titre_Facturation2Layout.setVerticalGroup(
            pannel_titre_Facturation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_titre_Facturation2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(gestion_locataireslabel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        controlleur_De_panels4.setBackground(new java.awt.Color(255, 51, 51));

        Button_proprietes_l.setText("Proprietes");
        Button_proprietes_l.addActionListener(new java.awt.event.ActionListener() {//action perform
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_proprietes_lActionPerformed(evt);
            }
        });

        Button_Locataire_l.setText("Locataire");
        Button_Locataire_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Locataire_lActionPerformed(evt);
            }
        });

        Facturation_l.setText("Facturation");
        Facturation_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Facturation_lActionPerformed(evt);
            }
        });

        Button_retour_loc_acc.setText("Retour");
        
        Button_retour_loc_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	retour(evt);
            }
        });

        javax.swing.GroupLayout controlleur_De_panels4Layout = new javax.swing.GroupLayout(controlleur_De_panels4);
        controlleur_De_panels4.setLayout(controlleur_De_panels4Layout);
        controlleur_De_panels4Layout.setHorizontalGroup(
            controlleur_De_panels4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlleur_De_panels4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(controlleur_De_panels4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlleur_De_panels4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Button_Locataire_l)
                        .addComponent(Button_proprietes_l))
                    .addGroup(controlleur_De_panels4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Facturation_l))
                    .addComponent(Button_retour_loc_acc))
                .addGap(30, 30, 30))
        );
        controlleur_De_panels4Layout.setVerticalGroup(
            controlleur_De_panels4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlleur_De_panels4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(Button_proprietes_l)
                .addGap(59, 59, 59)
                .addComponent(Button_Locataire_l)
                .addGap(65, 65, 65)
                .addComponent(Facturation_l)
                .addGap(63, 63, 63)
                .addComponent(Button_retour_loc_acc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pane_de_locataire.setBackground(new java.awt.Color(255, 255, 255));

        ncniLabel.setText("Numero de CNI:");

        nomLabel.setText("Nom");

        PrenomLabel.setText("Prenom");

        professionLabel.setText("Profession");

        localisationlabel2.setText("Contact");

        numero_de_cni_TextField.setForeground(new java.awt.Color(0,0,0));

        nom_TextField.setForeground(new java.awt.Color(0,0,0));

        prenom_TextField.setForeground(new java.awt.Color(0,0,0));

        telephone_Textfield.setForeground(new java.awt.Color(0,0,0));

        profession_textfield.setForeground(new java.awt.Color(0,0,0));
        
        ///////////////////////////////////////////////
        
        //pannaue champs proprietes
    	String requete="SELECT * FROM status WHERE status=2";

		ResultSet result=conn.select(requete);
		ArrayList<Propriete> a=new ArrayList<Propriete>();
			a=ProprieteBdController.afficherToutesLesProprietes(result);
			for(Propriete prop:a) {
				String proprieteType = null;
				String statut=null;
				if(prop.getType()==1) {
				 proprieteType="maison";
				}
				else if(prop.getType()==2) {
					proprieteType="boutique";
				}
				if(prop.getStatut()==1) {
					statut="OCCUPEE";
				}
				else{
					statut="DISPONIBLE";
				}
				String data[]= {proprieteType,prop.getLocalisation(),statut};
				
			
			}
    
          
       
        
        
        
        
        ///////////////////////////////////AJOUTER UN LOCATAIRE GRACE AU BOUTTON AJOUTER QUI SE TROUVE DANS LOCATAIRE////////////////////////////////
          
        
			  String requete1 = "SELECT description FROM propriete WHERE status = 2";
			   try { 
			    ResultSet resultat = conn.select(requete1);
			    
			    ResultSetMetaData MetaData = resultat.getMetaData(); //recuperation des données de la requete
			   
			    while (resultat.next()) {

			       for (int i = 1; i <= MetaData.getColumnCount(); i++) {
			    	   
			        System.out.println (resultat.getString(i) );
			            String   elements_pro_libre[]= {resultat.getString(i)};
        
			            proprietes_libre_combo= new JComboBox<String>(elements_pro_libre);
			       }
			   
			    }
			    
			    resultat.close();
			 }
			   catch (SQLException e) {
			  
				 conn.arret(e.getMessage());
				 
			 }

         // ++++++++++++++ici la table
          
       
        
        
        button_ajouter_L.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
             // test si les champs sont vides
                if( numero_de_cni_TextField.getText().isEmpty() || nom_TextField.getText().isEmpty()||
                			prenom_TextField.getText().isEmpty() || telephone_Textfield.getText().isEmpty()||
                			profession_textfield.getText().isEmpty()) { 
                		
                	JOptionPane.showMessageDialog(null,"veuillez remplir tous les champs","ERREUR", JOptionPane.ERROR_MESSAGE);
                }else {
                	
               
   DefaultTableModel tbmodelm = (DefaultTableModel)locataire_table.getModel();

   String data1[]= {numero_de_cni_TextField.getText(), nom_TextField.getText(),prenom_TextField.getText(),telephone_Textfield.getText(),profession_textfield.getText()
	    };
   									tbmodelm.addRow(data1);
              // instantiation de l'objet Locataire
                	Locataire l = new Locataire(Integer.parseInt(numero_de_cni_TextField.getText()), nom_TextField.getText(),
                 			prenom_TextField.getText(), Integer.parseInt(telephone_Textfield.getText()),
                 			profession_textfield.getText());
                	LocataireBdController.enregistrement(l);
                	Propriete p=new Propriete();
                	LocationController loc=new LocationController();
                	loc.assigner(l, p);
                	
                 
                   
                    numero_de_cni_TextField.setText("");
                   nom_TextField.setText("");
                   prenom_TextField.setText("");
                   telephone_Textfield.setText("");
                   profession_textfield.setText("");
           	   
       
      
                	
                };
                	
        		}});
        
        

        button_ajouter_L.setText("Ajouter");
        
        ///////////////////////////////////MODIFIER UN LOCATAIRE GRACE AU BOUTTON Modifier QUI SE TROUVE DANS LOCATAIRE////////////////////////////////
        buttuon_Modifier_L.setText("Modifier_l");
        
        buttuon_Modifier_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         	   DefaultTableModel tbmodel_tab_l= (DefaultTableModel)  locataire_table.getModel();
         	   
         	  int i=propriete_table.getSelectedRow();
         	  if(i<=-1) {
         		 JOptionPane.showMessageDialog(null,"veuillez selectionner une ligne du champs a modifier " ,"ERREUR", JOptionPane.ERROR_MESSAGE);
         	  }
         	  else
         	  {
         		
         		 tbmodel_tab_l.setValueAt(numero_de_cni_TextField.getText(),i,0);
         		tbmodel_tab_l.setValueAt(nom_TextField.getText(),i,1);
         		tbmodel_tab_l.setValueAt( prenom_TextField.getText(),i,2);
         		tbmodel_tab_l.setValueAt(telephone_Textfield.getText(),i,3);
         		tbmodel_tab_l.setValueAt(profession_textfield.getText(),i,4);
      
         	  }
    	   
         	  
            }});

        propriete_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jTableMouseClicked_locataire(evt);
            	
            }
        });

        


        ///////////////////////////////////SUPPRIMER UN LOCATAIRE GRACE AU BOUTTON AJOUTER QUI SE TROUVE DANS LOCATAIRE////////////////////////////////
        

        button_supprimer_L.setText("Supprimer_l");
        
        
        button_supprimer_L.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                	
             	   DefaultTableModel tbmodel_locataire = (DefaultTableModel)  locataire_table.getModel();
             	   
             	   int i=locataire_table.getSelectedRow();
             	   if(i<-1) {
                		 JOptionPane.showMessageDialog(null,"veuillez selectionner une ligne du champs a supprimer " ,"ERREUR", JOptionPane.ERROR_MESSAGE);
                	  }
                	  else
                	  {
                		  tbmodel_locataire.removeRow(i);
                	  } }});


        gestion_de_locatairelabel.setBackground(new java.awt.Color(255, 51, 51));
        gestion_de_locatairelabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gestion_de_locatairelabel.setForeground(new java.awt.Color(255, 51, 51));
        gestion_de_locatairelabel.setText("LOCATAIRE");

        javax.swing.GroupLayout pane_de_locataireLayout = new javax.swing.GroupLayout(pane_de_locataire);
        pane_de_locataire.setLayout(pane_de_locataireLayout);
        pane_de_locataireLayout.setHorizontalGroup(
            pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_de_locataireLayout.createSequentialGroup()
                .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_de_locataireLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ncniLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PrenomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(localisationlabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                            .addComponent(professionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            
                            .addComponent(proprietes_libre, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            
                            .addComponent(button_ajouter_L))
                        .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pane_de_locataireLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(numero_de_cni_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                            .addComponent(nom_TextField)
                                            ///////////////////////////
                                            .addComponent(proprietes_libre_combo)
                                            .addComponent(telephone_Textfield))
                                        .addComponent(prenom_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(profession_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pane_de_locataireLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(buttuon_Modifier_L)
                                .addGap(30, 30, 30)
                                .addComponent(button_supprimer_L))))
                    .addGroup(pane_de_locataireLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gestion_de_locatairelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pane_de_locataireLayout.setVerticalGroup(
            pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_de_locataireLayout.createSequentialGroup()
                .addComponent(gestion_de_locatairelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_de_cni_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ncniLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrenomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephone_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localisationlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(professionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profession_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
               .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            		   /////////////////////////
                        .addComponent(proprietes_libre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(proprietes_libre_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                  
                
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pane_de_locataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_ajouter_L)
                    .addComponent(buttuon_Modifier_L)
                    .addComponent(button_supprimer_L))
                .addGap(190, 190, 190))
        );

        locataire_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Numero de CNI", "Nom", "Prenom", "Contact", "Profession"
            }
        ));
        jScrollPane4.setViewportView(locataire_table);
        if (locataire_table.getColumnModel().getColumnCount() > 0) {
            locataire_table.getColumnModel().getColumn(4).setHeaderValue("Profession");
        }

        javax.swing.GroupLayout Panel_LocataireLayout = new javax.swing.GroupLayout(Panel_Locataire);
        Panel_Locataire.setLayout(Panel_LocataireLayout);
        Panel_LocataireLayout.setHorizontalGroup(
            Panel_LocataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LocataireLayout.createSequentialGroup()
                .addComponent(controlleur_De_panels4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pane_de_locataire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
            .addComponent(pannel_titre_de_facture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_LocataireLayout.setVerticalGroup(
            Panel_LocataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(Panel_LocataireLayout.createSequentialGroup()
                .addComponent(pannel_titre_de_facture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_LocataireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane_de_locataire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlleur_De_panels4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE))
                .addContainerGap())
        );

        Panel_principal.add(Panel_Locataire, "card4");

       javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout1);
        layout1.setHorizontalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout1.setVerticalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
   /////////////// fonction de recuperation des valeurs des champs de la gestion de faturation///////////////////
    
    public String getnumero_de_cni_TextField1() {
    	return  numero_de_cni_TextField1.getText();
    } 
   public String getnom_TextField1() {
	   return  nom_TextField1.getText();
   }
    public String getprenom_TextField1() {
    	return   prenom_TextField1.getText();
    }
    public String gettelephone_Textfield1(){
     return	telephone_Textfield1.getText();
    }
   
///////////////////////fonction de recuperation des valeurs des champs de la gestion de proprietes//////////////////////////
    
    
  
   public String getjTextField2() {
	   return  prix_mensuel_textfield.getText();
   }
    public String getjTextField3() {
    	return   description_textArea.getText();
    }
    public String getjTextField4(){
     return	localisation_textfield.getText();
    }
    public String getjTextField5 () {
    	return    statut_textfield.getText();
    }
    

    //////////////////////////fonction de recuperation des valeurs des champs de la gestion de locataires////////////////////////

    public String getnumero_de_cni_TextField() {
    	return  numero_de_cni_TextField.getText();
    } 
   public String getnom_TextField() {
	   return  nom_TextField.getText();
   }
    public String getprenom_TextField() {
    	return  prenom_TextField.getText();
    }
    public String gettelephone_Textfield(){
     return	telephone_Textfield.getText();
    }
    public String getprofession_textfield() {
    	return   profession_textfield.getText();
    }
    
    //////////////////////////////////fonction d'evenement lorsqu'on click sur une ligne du tableau///////////////////////////////////////////
    
    
      private void jTableMouseClicked_pro (MouseEvent evt) {
    	int i =propriete_table.getSelectedRow();    	
      	 DefaultTableModel tbmodel = (DefaultTableModel)propriete_table.getModel();
      	 
      	
      	 String Prix_mensuel = tbmodel.getValueAt(i,1).toString();
       	 String description = tbmodel.getValueAt(i,2).toString();
       	 String Locaction = tbmodel.getValueAt(i,3).toString();
       	 String satatut = tbmodel.getValueAt(i,4).toString();
       	 
       	typedeprorpriete_combo.setSelectedItem(tbmodel.getValueAt(i,0).toString());
            prix_mensuel_textfield.setText(Prix_mensuel);
            description_textArea.setText(description);
            localisation_textfield.setText(Locaction);
            statut_textfield.setText(satatut);
            
    }; 
    
    private void jTableMouseClicked_locataire(MouseEvent evt) {
    	
    	
    	  int i =locataire_table.getSelectedRow();
    	  
	      	 DefaultTableModel tbmodel_tab_l = (DefaultTableModel)locataire_table.getModel();
	      	 
	    	 String numero_de_cni = tbmodel_tab_l.getValueAt(i,0).toString();
	      	 String prix_mensuel= tbmodel_tab_l.getValueAt(i,1).toString();
	       	 String nom = tbmodel_tab_l.getValueAt(i,2).toString();
	       	 String prenom = tbmodel_tab_l.getValueAt(i,3).toString();
	       	 String proffession =tbmodel_tab_l.getValueAt(i,4).toString();
	       	 
	    numero_de_cni_TextField.setText(numero_de_cni);
	            nom_TextField.setText(prix_mensuel);
	            prenom_TextField.setText(nom);
	            telephone_Textfield.setText(prenom);
	            profession_textfield.setText(proffession);
	            
	            System.out.println("tes");
 
    }; 


 
    private void Button_proprietes_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_proprietes_fActionPerformed
        Panel_Proprietes.setVisible(true);
        Panel_Facturation.setVisible(false);
        Panel_Locataire.setVisible(false);
        panneau_accuiel.setVisible(false);
    }//GEN-LAST:event_Button_proprietes_fActionPerformed

    private void Button_Locataire_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Locataire_fActionPerformed
        Panel_Locataire.setVisible(true);
        Panel_Proprietes.setVisible(false);
         Panel_Facturation.setVisible(false);
         panneau_accuiel.setVisible(false);
         DefaultTableModel tbmodel_LO = (DefaultTableModel)locataire_table .getModel();
         
 		
    }//GEN-LAST:event_Button_Locataire_fActionPerformed

    private void boutton_Facturation_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_Facturation_fActionPerformed
       Panel_Facturation.setVisible(true);
        Panel_Locataire.setVisible(false);
        Panel_Proprietes.setVisible(false);
        panneau_accuiel.setVisible(false);    }//GEN-LAST:event_boutton_Facturation_fActionPerformed

    private void Facturation_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Facturation_lActionPerformed
        Panel_Proprietes.setVisible(false);
        Panel_Facturation.setVisible(true);
        Panel_Locataire.setVisible(false);
        panneau_accuiel.setVisible(false);    }//GEN-LAST:event_Facturation_lActionPerformed

    private void Button_Locataire_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Locataire_lActionPerformed
        Panel_Proprietes.setVisible(false);
        Panel_Facturation.setVisible(false);
        Panel_Locataire.setVisible(true);
        panneau_accuiel.setVisible(false);    }//GEN-LAST:event_Button_Locataire_lActionPerformed

    private void Button_proprietes_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_proprietes_lActionPerformed
        Panel_Proprietes.setVisible(true);
        Panel_Facturation.setVisible(false);
        Panel_Locataire.setVisible(false);
        panneau_accuiel.setVisible(false);        
    }//GEN-LAST:event_Button_proprietes_lActionPerformed

    private void Facturation_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Facturation_pActionPerformed
        Panel_Proprietes.setVisible(false);
        Panel_Facturation.setVisible(true);
        Panel_Locataire.setVisible(false);
        panneau_accuiel.setVisible(false);}
    private void Button_Locataire_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Locataire_pActionPerformed
        Panel_Proprietes.setVisible(false);
        Panel_Facturation.setVisible(false);
        Panel_Locataire.setVisible(true);
        panneau_accuiel.setVisible(false);}

    //GEN-LAST:event_Button_Locataire_pActionPerformed
   
  private void Button_proprietes_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_proprietes_pActionPerformed
        Panel_Proprietes.setVisible(true);
        Panel_Facturation.setVisible(false);
        Panel_Locataire.setVisible(false);
        panneau_accuiel.setVisible(false);}

    @SuppressWarnings("unused")
	private void retour(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_proprietes_pActionPerformed
    	 Panel_Proprietes.setVisible(false);
         Panel_Facturation.setVisible(false);
         Panel_Locataire.setVisible(false);
         panneau_accuiel.setVisible(true);
       }
    

    private void button_quiterSystemeActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    	this.dispose();    }                                                    

    private void jButton_locataireActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    	 Panel_Proprietes.setVisible(false);
         Panel_Facturation.setVisible(false);
         Panel_Locataire.setVisible(true);
         panneau_accuiel.setVisible(false);
    }                                                 

    private void jButton_factureActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	 Panel_Proprietes.setVisible(false);
         Panel_Facturation.setVisible(true);
         Panel_Locataire.setVisible(false);
         panneau_accuiel.setVisible(false);
    }                                               

    private void jButton_proprietesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	 Panel_Proprietes.setVisible(true);
         Panel_Facturation.setVisible(false);
         Panel_Locataire.setVisible(false);
         panneau_accuiel.setVisible(false);
                                                    
    }
        
    
// </editor-fold> 

    public static void main(String args[]) {
     Application App =new Application();
     App.setVisible(true);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Locataire_f;
    private javax.swing.JButton Button_Locataire_l;
    private javax.swing.JButton Button_Locataire_p;
    
    private javax.swing.JButton Button_retour_pro_acc;
    private javax.swing.JButton Button_retour_loc_acc;
    private javax.swing.JButton Button_retour_fac_acc;
    private javax.swing.JButton Button_proprietes_f;
    private javax.swing.JButton Button_proprietes_l;
    private javax.swing.JButton Button_proprietes_p;
    private javax.swing.JButton Facturation_l;
    private javax.swing.JButton Facturation_p;
    private javax.swing.JPanel Panel_Facturation;
    private javax.swing.JPanel Panel_Locataire;
    private javax.swing.JPanel Panel_Proprietes;
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JLabel PrenomLabel;
    private javax.swing.JLabel cautionlabel;
    private javax.swing.JButton boutton_Facturation_f;
    private javax.swing.JButton button_ajouter_L;
    private javax.swing.JButton button_ajouter_P;
    private javax.swing.JButton button_supprimer_L;
    private javax.swing.JButton button_supprimer_p;
    private javax.swing.JButton buttuon_Modifier_L;
    private javax.swing.JButton boutton_enregistrer;
    private javax.swing.JButton buttuon_Modifier_p;
    private javax.swing.JPanel controlleur_De_panels2;
    private javax.swing.JPanel controlleur_De_panels3;
    private javax.swing.JPanel controlleur_De_panels4;
    private javax.swing.JLabel propriete_label;
    private javax.swing.JLabel gestion_de_locatairelabel;
    private javax.swing.JLabel gestion_pro_label;
    private javax.swing.JLabel gestion_locataireslabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel descrition_label;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel gestion_de_fac_label;
    private javax.swing.JLabel titre_champs_f;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable propriete_table;
    private javax.swing.JTable Facture_table;
    private javax.swing.JTable locataire_table;
    JLabel proprietes_libre;
    
    private javax.swing.JComboBox<String> typedeprorpriete_combo;
    private javax.swing.JComboBox<String> proprietes_libre_combo;
    private javax.swing.JTextField prix_mensuel_textfield;
    private javax.swing.JTextArea description_textArea;
    private javax.swing.JTextField localisation_textfield;
    private javax.swing.JTextField statut_textfield;
    private javax.swing.JLabel localisationlabel2;
    private javax.swing.JLabel localisationlabel3;
    private javax.swing.JLabel ncniLabel;
    private javax.swing.JLabel Id_loc_label;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JLabel type_pro_Label;
    private javax.swing.JTextField nom_TextField;
    private javax.swing.JTextField nom_TextField1;
    private javax.swing.JTextField numero_de_cni_TextField;
    private javax.swing.JTextField numero_de_cni_TextField1;
    private javax.swing.JPanel pane_de_champ1;
    private javax.swing.JPanel pane_de_champ_proprietes;
    private javax.swing.JPanel pane_de_la_table;
    private javax.swing.JPanel pane_de_la_table2;
    private javax.swing.JPanel pane_de_locataire;
    private javax.swing.JPanel pannel_titre_Facturation;
    private javax.swing.JPanel pannel_tire_proprietes;
    private javax.swing.JPanel pannel_titre_de_facture;
    private javax.swing.JTextField prenom_TextField;
    private javax.swing.JTextField prenom_TextField1;
    private javax.swing.JLabel professionLabel;
    private javax.swing.JTextField profession_textfield;
    private javax.swing.JTextField telephone_Textfield;
    private javax.swing.JTextField telephone_Textfield1;
 //   private javax.swing.JLabel proprietes_libre;
    // Variables declaration - do not modify                     
    private javax.swing.JButton button_quiterSysteme;
    private javax.swing.JButton jButton_facture;
    private javax.swing.JButton jButton_locataire;
    private javax.swing.JButton jButton_proprietes;
    private javax.swing.JLabel jLabel_A_GES_PRO;
    private javax.swing.JLabel jLabel_A_logo;
  
    private javax.swing.JLabel jLabel_A_quitter;
    
    private javax.swing.JLabel label_A_facture;
    private javax.swing.JLabel label_A_gest_lo;
    private javax.swing.JPanel panneau_accuiel;
    // End of variables declaration//GEN-END:variables
}
