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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Scott
 */
public class TestJobSuitabilityUICntl implements Initializable {

    private Stage mainStage;
    private NavigationCntl theNavigationCntl;
    
    @FXML private Button homeButton;
    @FXML private Button exitButton;
    @FXML private TextField jobTitleTF;
    @FXML private TextField userPersonalityTF;
    @FXML private TextField desiredPersonalityTF;
    @FXML private TextField resultTF;
    
    @FXML public void loadMainMenu(ActionEvent event) {
        
        //get the current stage
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // create NavigationCntl object to setup scene
        theNavigationCntl = new NavigationCntl(mainStage);
    }
    
    @FXML public void exitApp(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
