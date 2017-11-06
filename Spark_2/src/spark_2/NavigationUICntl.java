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
 * @author ags12
 */
public class NavigationUICntl implements Initializable {
    
    private Stage mainStage;
    private UserProfileCntl theUserProfileCntl;
    
    @FXML private Button profileButton;
    
    
    @FXML public void loadProfile(ActionEvent even) {
        
        mainStage = (Stage) profileButton.getScene().getWindow();
        
        theUserProfileCntl = new UserProfileCntl(mainStage);
        
    }
    
     @FXML public void exitApp(ActionEvent event) {
        System.exit(0);
    }
     
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
