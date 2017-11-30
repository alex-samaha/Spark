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
    
    
    @FXML private Button homeButton;
    @FXML private Button submitButton;
    @FXML private TextField jobTextField;
    @FXML private TextField companyTextField;
    @FXML private TextField descriptionTextField;
    @FXML private TextField salaryTextField;
    
    @FXML public void loadMainMenu(ActionEvent event) {
        
        //get the current stage
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // create NavigationCntl object to setup scene
        theNavigationCntl = new NavigationCntl(mainStage);
    }
    
    @FXML public void submitButton(ActionEvent event){
        
        Job newJob = new Job(jobTextField.getText(), companyTextField.getText(), descriptionTextField.getText(), Integer.parseInt(salaryTextField.getText()));
        this.theNavigationCntl.returnTheJobList().add(newJob);
        
        //get the current stage
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // create NavigationCntl object to setup scene
        theNavigationCntl = new NavigationCntl(mainStage);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }
    
}
