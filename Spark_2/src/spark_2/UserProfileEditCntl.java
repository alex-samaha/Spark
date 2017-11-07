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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Scott
 */
public class UserProfileEditCntl  {

    
    private Stage mainStage;
    
    public UserProfileEditCntl(Stage currentStage) {
    
        mainStage = currentStage;
        setupEditProfileScene();
    }
    
    
    public void setupEditProfileScene() {
        
        Parent root;
        Scene scene;
        
        try {
            // load the new fxml file
            root = FXMLLoader.load(getClass().getResource("UserProfileEditUI.fxml"));
            scene = new Scene(root, 600, 400);
            scene.getStylesheets().add(getClass().getResource("UserProfileEditUI.css").toExternalForm());
            
            // set the stage with the new scene (Main Menu)
            mainStage.setScene(scene);
            mainStage.setTitle("User Profile Edit");
            mainStage.show();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
        
}
