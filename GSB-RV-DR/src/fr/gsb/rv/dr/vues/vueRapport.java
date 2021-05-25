/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gsb.rv.dr.vues;

import fr.gsb.rv.dr.entities.RapportVisite;
import fr.gsb.rv.dr.modeles.ModeleGsbRv;
import fr.gsb.rv.dr.technique.ConnexionException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import static javafx.scene.control.ButtonBar.ButtonData.CANCEL_CLOSE;
import static javafx.scene.control.ButtonBar.ButtonData.OK_DONE;
import javafx.scene.control.ButtonType;
import static javafx.scene.control.ButtonType.CLOSE;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 *
 * @author developpeur
 */
public class vueRapport extends Dialog {
    private Dialog diaRapp = new Dialog();
    private RadioButton rbValide = new RadioButton("Validé");
    private RadioButton rbCompleter = new RadioButton("A compléter");
    private RadioButton rbCorriger = new RadioButton("A corriger");
    
    public vueRapport(RapportVisite leRapportVis){
        
//Création Boîte verticale
        VBox vbAll = new VBox();
        
//Dimension
        vbAll.setPadding(new Insets(5, 350, 5, 5));
        
//Titre de la fenêtre 
        setTitle("Rapport numéro: " + leRapportVis.getRap_num());
        setHeaderText(leRapportVis.getVisiteur().getVis_nom() + " " + leRapportVis.getVisiteur().getVis_prenom() + "\n" + "Informations du Rapport Visite");
        
//Déclaration des variables et valorisation
        Label avis = new Label("Avis: " );
        Text dateVis = new Text("La date de la Visite: " + leRapportVis.getRap_date_visite());
        Text dateRed = new Text("Date de rédaction: " + leRapportVis.getRap_date_saisie());
        Text visiteur = new Text("Visiteur: " + leRapportVis.getVisiteur().getVis_nom());
        Text praticien = new Text("Patraticien: " + leRapportVis.getPraticien().getPra_nom() + " de " + leRapportVis.getPraticien().getPra_ville());
        Text motif = new Text("Motif: " + leRapportVis.getMotif().getMotif_libelle());
        Text bilan = new Text("Bilan de la visite: " + leRapportVis.getRap_bilan());
        Text coefConf = new Text("Coefficient Confiance: " + leRapportVis.getRap_coeff_confiance());
        Text lu = new Text();
        if(leRapportVis.isRap_lu()){
            lu.setText("Lu: Oui");
        }else{
            lu.setText("Lu: Non");
        }
        /*
        //Grille (GridPane) avec les boutons radios
        GridPane grilleRadio = new GridPane();
        grilleRadio.setHgap(10);
        grilleRadio.setVgap(10);
        
        //Groupe de boutons radio
        ToggleGroup grpTri = new ToggleGroup();
        
        //Boutons radios dans le groupe
        rbValide.setToggleGroup(grpTri);
        rbCompleter.setToggleGroup(grpTri);
        rbCorriger.setToggleGroup(grpTri);
        
        //Forcer la sélection
        if(avis.equals("Validé") ){
           rbValide.setSelected(true); 
        }
        else if(avis.equals("A compléter")){
           rbCompleter.setSelected(true);
        }
        else {
           rbCorriger.setSelected(true);
        }
        
        
        //Ajouter les boutons à la vue
        grilleRadio.add(rbValide, 0, 0);
        grilleRadio.add(rbCompleter, 1, 0);
        grilleRadio.add(rbCorriger, 2, 0);
        vbAll.getChildren().add(grilleRadio);
        
        //Boutons
        ButtonType btnLu = new ButtonType("Manquer comme LU", OK_DONE);
        Button btnValid = new Button("Valider");
        if(leRapportVis.isRap_lu() == false){
            this.getDialogPane().getButtonTypes().add(btnLu);
            this.getDialogPane().getChildren().add(btnValid);
        }else{
            ButtonType annuler = new ButtonType("Fermer", CANCEL_CLOSE);
            this.getDialogPane().getButtonTypes().add(annuler);
            this.getDialogPane().getChildren().add(btnValid);
        }
        //action valid
        btnValid.setOnAction(
            new EventHandler<ActionEvent>(){
                public void handler(ActionEvent event) throws ConnexionException, SQLException{
                    ModeleGsbRv.setRapportVisiteAvis(leRapportVis.getRap_avis(), leRapportVis.getVisiteur().getVis_matricule(), leRapportVis.getRap_num());
                }

            @Override
            public void handle(ActionEvent event) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        //Ajout des variable dans la VBox
        vbAll.getChildren().addAll( avis, dateVis, dateRed, visiteur, praticien, motif, bilan, coefConf, lu);
        //Ajout dans la boîte de Dialog
        getDialogPane().setContent(vbAll);

        setResultConverter(
            dialogBtn ->{
                if(dialogBtn == btnLu){
                    return "valider";
                } 
                return null;
            });
*/
    }
}
