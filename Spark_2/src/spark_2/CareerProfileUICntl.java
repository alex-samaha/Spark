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
 * FXML Controller class
 *
 * @author Scott
 */
public class CareerProfileUICntl implements Initializable {

    private Stage mainStage;
    private CareerProfileCntl theCareerProfileCntl;
    private CareerProfile theCareerProfile;
    private CareerProfileEditCntl theCareerProfileEditCntl;
    private NavigationCntl theNavigationCntl;
    //private CareerProfileEditCntl theCareerProfileEditCntl;
    
    @FXML private Button homeButton;
    @FXML private Button editProfileButton;
    @FXML private Label companyNameLabel;
    @FXML private Label availableJobsLabel;
    @FXML private Label locationLabel;
    
    
    @FXML public void loadMainMenu(ActionEvent event) {
        
        //get the current stage
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // create NavigationCntl object to setup scene
        theNavigationCntl = new NavigationCntl(mainStage);
    }
    
    @FXML public void loadEditProfile(ActionEvent event) {
        
        // get the current stage
        mainStage = (Stage) editProfileButton.getScene().getWindow();
        
        // create UserProfileEditCntl object to setup scene
        theCareerProfileEditCntl = new CareerProfileEditCntl(mainStage);
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        theCareerProfile = new CareerProfile();
        companyNameLabel.setText(theCareerProfile.getCompanyName());
        availableJobsLabel.setText(theCareerProfile.getJobType());
        locationLabel.setText(theCareerProfile.getLocation());
    }    
    
}
