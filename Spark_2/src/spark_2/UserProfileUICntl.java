/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * FXML Controller class
 *
 * @author Scott
 */
public class UserProfileUICntl implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    private Stage mainStage;
    private UserProfileEditCntl theUserProfileEditCntl;
    private UserProfile theUserProfile;
    
    @FXML private Button editButton;
    @FXML private Label nameLabel;
    @FXML private Label personalityLabel;
    @FXML private Label educationLabel;
    
    
    
    @FXML public void loadEditProfile(ActionEvent event) {
        
        // get the current stage
        mainStage = (Stage) editButton.getScene().getWindow();
        
        // create UserProfileEditCntl object to setup scene
        theUserProfileEditCntl = new UserProfileEditCntl(mainStage);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        theUserProfile = new UserProfile();
        nameLabel.setText(theUserProfile.getName());
        personalityLabel.setText(theUserProfile.getUserPersonality());
        educationLabel.setText(theUserProfile.getEducation());
        
    
    }    
    
}
