/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ags12
 */
public class CareerPageUICntl implements Initializable {

    
    private ResearchCareersCntl theResearchCareersCntl;
    private Stage mainStage;
    
    @FXML private Button resultsButton;
    @FXML private Label careerTitleLabel;
    @FXML private Label descriptionLabel;
    
    
    @FXML public void loadResearchCareersPage() {
        mainStage = (Stage) resultsButton.getScene().getWindow();
        
       theResearchCareersCntl = new ResearchCareersCntl(mainStage);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Career currentCareer = Session.theCareer;
        
        // set wrap text to true to display text on multiple lines
        descriptionLabel.setWrapText(true);
        careerTitleLabel.setText(currentCareer.getTitle());
        descriptionLabel.setText(currentCareer.getDescription());
        
    }    
    
}
