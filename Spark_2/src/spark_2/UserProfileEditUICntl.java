/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
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
import org.json.simple.parser.JSONParser;

/**
 *
 * @author ags12
 */
public class UserProfileEditUICntl implements Initializable{
    
    private JSONObject data;
    private Stage mainStage;
    private UserProfileCntl theUserProfileCntl;
    private NavigationCntl theNavigationCntl;
    
    @FXML private TextField name;
    @FXML private TextField personality;
    @FXML private TextField education;
    @FXML private Button homeButton;
    
    
    
    // returns the user to the main menu
    @FXML public void loadMainMenu(ActionEvent event) {
        
        // get the current window
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // instantiate NavigationCntl to load the main menu
        theNavigationCntl = new NavigationCntl(mainStage);
        
    }
    
    
    // returns back to the user profile page
    // when the users clicks on the submit button it will take them back to their profile
    public void loadProfile() {
        
        mainStage = (Stage) name.getScene().getWindow();
        
        theUserProfileCntl = new UserProfileCntl(mainStage);
        
    }
    
    // saves the profile data to the JSON file
    @FXML public void saveProfile(ActionEvent event) {
     
        JSONArray userList = (JSONArray) data.get("users");
        
        JSONObject user = new JSONObject();
        user.put("Username", Session.userID);
        
        // user inputted text
        String userName = name.getText();
        String userPersonality = personality.getText();
        String userEducation = education.getText();
       
        // create the individual user object
        // user will go into the userList JSON Array
        JSONObject userNameJSON = new JSONObject();
        userNameJSON.put("Name", userName);

        // create the user profile info JSON object
        // the profileInfo array will go into the userList array
        JSONArray profileInfo = new JSONArray();

        // create the individual profile attributes
        // the attributes will go into the profileInfo
        JSONObject personalityJSON = new JSONObject();
        personalityJSON.put("Personality", userPersonality);

        JSONObject educationJSON = new JSONObject();
        educationJSON.put("Education", userEducation);


        profileInfo.add(userNameJSON);
        profileInfo.add(personalityJSON);
        profileInfo.add(educationJSON);

        user.put("Profile Info", profileInfo);
        
        userList.add(user);
        
        
        data.put("users", userList);


        try {
            // write the contents to a file
            FileWriter file = new FileWriter("data.json");
            file.write(data.toJSONString());

            // flush buffer and close contents
            file.flush();
            file.close();
            
            
            System.out.println("Contents written to the file");
            
            loadProfile();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    // loads up the data file
    public void loadData() throws org.json.simple.parser.ParseException{
     
        JSONParser parser = new JSONParser();
        data = new JSONObject();
        
        try {
            
            Object obj = parser.parse(new FileReader("data.json"));
            data = (JSONObject) obj;

            
        }
        
        catch (FileNotFoundException e) {
            e.printStackTrace();
            
        }
        
        catch (IOException e) {
            
            e.printStackTrace();
            
        }
       
        
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            loadData();
            personality.setEditable(false);
        }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
