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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Scott
 */
public class PersonalityTestUICntl implements Initializable{
    
    private Stage mainStage;
    private NavigationCntl theNavigationCntl;
    private PersonalityTest thePersonalityTest;
    
    @FXML private Button homeButton;
    @FXML private Button submitButton;
    @FXML private TextField q1TextField;
    @FXML private TextField q2TextField;
    @FXML private TextField q3TextField;
    @FXML private TextField q4TextField;
    
    @FXML public void loadMainMenu(ActionEvent event) {
        
        // get current window
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // instantiate NavigationCntl and load main menu
        theNavigationCntl = new NavigationCntl(mainStage);
        
    }
    
    @FXML public void submitPersonalityTest(ActionEvent event){
        String personalityNameToDisplay;
        
        thePersonalityTest = new PersonalityTest(q1TextField.getText(), q2TextField.getText(), q3TextField.getText(), q4TextField.getText());
        personalityNameToDisplay = thePersonalityTest.getPersonalityType(thePersonalityTest.personalityNum()).getName();
        
        
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("PersonalityTestUICntl");
    }
    
}
