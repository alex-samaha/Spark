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
 * @author ags12
 */
public class PersonalityTestCntl {
    
    private Stage mainStage;
    
    
    public PersonalityTestCntl(Stage currentStage) {
        
        // load in the stage and set up the scene
        this.mainStage = currentStage;
        setupPersonalityTestScene();
        
    }
    
    public void setupPersonalityTestScene() {
        
        
        Parent root;
        Scene scene;
        
        try {
            System.out.println("TEST PLEASE");
            // load the new fxml file
            root = FXMLLoader.load(getClass().getResource("PersonalityTest.fxml"));
            scene = new Scene(root, 600, 400);
            scene.getStylesheets().add(getClass().getResource("PersonalityTest.css").toExternalForm());
            
            // set the stage with the new scene (Main Menu)
            mainStage.setScene(scene);
            mainStage.setTitle("Personality Test");
            mainStage.show();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
