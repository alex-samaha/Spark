/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Scott
 */
public class TestJobSuitabilityCntl {
    
    private Stage mainStage;
    
    public TestJobSuitabilityCntl(Stage currentStage){
        mainStage = currentStage;
        this.setupTestSuitabilityScene();
        
    }
    
    public void setupTestSuitabilityScene() {
        
        Parent root;
        Scene scene;
        
        try {
            // load the new fxml file
            root = FXMLLoader.load(getClass().getResource("TestJobSuitabilityUI.fxml"));
            scene = new Scene(root, 600, 400);
            scene.getStylesheets().add(getClass().getResource("UserProfileEditUI.css").toExternalForm());
            
            // set the stage with the new scene (Main Menu)
            mainStage.setScene(scene);
            mainStage.setTitle("Test Job Suitability");
            mainStage.show();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
