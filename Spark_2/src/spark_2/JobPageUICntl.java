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
public class JobPageUICntl implements Initializable {

    private Stage mainStage;
    private JobSearchCntl theJobSearchCntl;
    private TestJobSuitabilityCntl theTestJobSuitabilityCntl;
    
    @FXML private Label jobNameLabel;
    @FXML private Label jobTitleLabel;
    @FXML private Label jobLocationLabel;
    @FXML private Label jobPersonalityLabel;
    @FXML private Button resultsButton;
    @FXML private Button testSuitabilityButton;
    
    
    @FXML private void loadResultsPage() {
        mainStage = (Stage) resultsButton.getScene().getWindow();
        
        theJobSearchCntl = new JobSearchCntl(mainStage);
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Job currentJob = Session.theJob;
        
        jobNameLabel.setText("Company: " + currentJob.getCompanyName());
        jobTitleLabel.setText("Job Title: " + currentJob.getJobTitle());
        jobLocationLabel.setText("Location: California");
        jobPersonalityLabel.setText("Personality Type: " + currentJob.getPersonalityType());
        
    }    
    
}
