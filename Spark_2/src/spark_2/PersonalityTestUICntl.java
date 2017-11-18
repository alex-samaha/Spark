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
import javafx.stage.Stage;

/**
 *
 * @author Scott
 */
public class PersonalityTestUICntl implements Initializable{
    
    private Stage mainStage;
    private NavigationCntl theNavigationCntl;
    
    @FXML private Button homeButton;
    
    
    
    @FXML public void loadMainMenu(ActionEvent event) {
        
        // get current window
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // instantiate NavigationCntl and load main menu
        theNavigationCntl = new NavigationCntl(mainStage);
        
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("PersonalityTestUICntl");
    }
    
}
