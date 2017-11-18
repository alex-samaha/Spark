/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author ags12
 */
public class CareerProfileEditUICntl implements Initializable{
    
    private JSONObject data;
    private Stage mainStage;
    private NavigationCntl theNavigationCntl;
    private CareerProfile theCareerProfile;
    
    @FXML private TextField company, jobs, location;
    @FXML private Button homeButton;
    @FXML private Button submitButton;
    
    
    @FXML public void loadMainMenu(ActionEvent event) {
        
        // grab current window
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // instantiate NavigationCntl object and load main menu
        theNavigationCntl = new NavigationCntl(mainStage);
    }
    
    
    // saves the profile data to the JSON file
    @FXML public void saveProfile(ActionEvent event) {
        
        theCareerProfile = new CareerProfile();
        
        theCareerProfile.saveData(company.getText(), jobs.getText(), location.getText());
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    
}
