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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Scott
 */
public class PostJobUICntl implements Initializable{
    
    private Stage mainStage;
    private NavigationCntl theNavigationCntl;
    private CareerProfileCntl theCareerProfileCntl;
    private JobList theJobList;
    
    
    @FXML private Button homeButton;
    @FXML private Button submitButton;
    @FXML private TextField jobTextField;
    @FXML private TextField companyTextField;
    @FXML private TextField descriptionTextField;
    @FXML private TextField personalityTextField;
    
    @FXML public void loadMainMenu(ActionEvent event) {
        
        //get the current stage
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // create NavigationCntl object to setup scene
        theNavigationCntl = new NavigationCntl(mainStage);
    }
    
    @FXML public void submitButton(ActionEvent event){
        if(jobTextField.getText() != null && companyTextField.getText() != null && descriptionTextField.getText() != null && personalityTextField.getText() != null){
            
            Job newJob = new Job(jobTextField.getText(), companyTextField.getText(), personalityTextField.getText());
            theJobList = new JobList();
            theJobList.add(newJob);
            
            System.out.println("TITLE: " + newJob.getJobTitle());
            
            //get the current stage
            mainStage = (Stage) submitButton.getScene().getWindow();

            // create NavigationCntl object to setup scene
            theCareerProfileCntl = new CareerProfileCntl(mainStage);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }
    
}
