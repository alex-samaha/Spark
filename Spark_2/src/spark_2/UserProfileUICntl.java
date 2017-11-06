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
    
    public void showProfileData() throws ParseException {
        
        JSONParser parser = new JSONParser();
        JSONObject data = new JSONObject();
        
        try {
            
            Object obj = parser.parse(new FileReader("data.json"));
            data = (JSONObject) obj;
            JSONArray userList = (JSONArray) data.get("users");
            
            for (Object user : userList) {
                // get the overall user data (general user object)
                JSONObject userJSON = (JSONObject) user;
                
                if(userJSON.get("Username").equals(Session.userID)) {
                
                    // grab the current user's profile data
                    JSONArray userProfile = (JSONArray) userJSON.get("Profile Info");
                    JSONObject name = (JSONObject) userProfile.get(0);
                    JSONObject personality = (JSONObject) userProfile.get(1);
                    JSONObject education = (JSONObject) userProfile.get(2);

                    nameLabel.setText(name.get("Name").toString());
                    personalityLabel.setText(personality.get("Personality").toString());
                    educationLabel.setText(education.get("Education").toString());
                    
                    System.out.println(userJSON.get("Username"));
                    System.out.println(name.get("Name"));
                    System.out.println(personality.get("Personality"));
                    System.out.println(education.get("Education"));
                    
                }
            }
            
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            showProfileData();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
    
}
