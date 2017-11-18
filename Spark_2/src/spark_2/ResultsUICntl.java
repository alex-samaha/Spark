/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Scott
 */
public class ResultsUICntl implements Initializable{

    private Stage mainStage;
    private NavigationCntl theNavigationCntl;
    
    @FXML private Button homeButton;
    @FXML private Label scoreLabel;
    @FXML private Label personalityLabel;
    @FXML private Label descriptionLabel;
    
    @FXML public void loadMainMenu(ActionEvent event) {
        
        //get the current stage
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // create NavigationCntl object to setup scene
        theNavigationCntl = new NavigationCntl(mainStage);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        scoreLabel.setText(Double.toString(PersonalityTest.personalityScore));
        personalityLabel.setText(PersonalityType.name);
        descriptionLabel.setText(PersonalityType.description);

    }
    
}
