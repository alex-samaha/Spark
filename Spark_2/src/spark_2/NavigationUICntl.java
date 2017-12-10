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
    private PersonalityTestCntl thePersonalityTestCntl;
    private CareerProfileCntl theCareerProfileCntl;
    private JobSearchCntl theJobSearchCntl;
    private ResearchCareersCntl theResearchCareersCntl;
    private User theUser;
    private String userType;
    
    @FXML private Button profileButton;
    @FXML private Button personalityTestButton;
    @FXML private Button jobSearchButton;
    @FXML private Button researchCareersButton;
    
    @FXML public void loadProfile(ActionEvent even) {
        
        userType = theUser.getUserType();
        
        // grab the current window
        mainStage = (Stage) profileButton.getScene().getWindow();
        
        if(userType.equals("user")) {
            // Instantiate UserProfileCntl and pass stage to load profile UI
            theUserProfileCntl = new UserProfileCntl(mainStage);
        }
        
        else {
            theCareerProfileCntl = new CareerProfileCntl(mainStage);
        }
        
    }
    
    @FXML public void loadTest(ActionEvent event) {
        
        // grab the current window
        mainStage = (Stage) personalityTestButton.getScene().getWindow();
        
        // Instantiate PersonalityTestCntl and pass stage to load PersonalityTest UI
        thePersonalityTestCntl = new PersonalityTestCntl(mainStage);
        
    }
    
    @FXML public void loadJobSearch(ActionEvent event) {
        
        // grab the current window
        mainStage = (Stage) jobSearchButton.getScene().getWindow();
        
        // Instantiate JobSearchCntl and pass stage to load JobSearch UI
        theJobSearchCntl = new JobSearchCntl(mainStage);
       
    }
    
    @FXML public void loadResearchCareers(ActionEvent event) {
        
        // grab the current window
        mainStage = (Stage) researchCareersButton.getScene().getWindow();
        
        // Instantiate ResearchCareersCntl and pass stage to load Research Careers UI
        theResearchCareersCntl = new ResearchCareersCntl(mainStage);
       
    }
    
     @FXML public void exitApp(ActionEvent event) {
        System.exit(0);
    }
     
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        theUser = new User();
        Session.personalityType = theUser.getPersonalityType();
    }    
    
    
}
