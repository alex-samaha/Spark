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
public class ResultsCntl {
    private Stage mainStage;
    
    public ResultsCntl(Stage currentStage){
        mainStage = currentStage;
        setupResultsScene();
    }
    
    public void setupResultsScene(){
        Parent root;
        Scene scene;
        
        try {
            // load the new fxml file
            root = FXMLLoader.load(getClass().getResource("ResultsUI.fxml"));
            scene = new Scene(root, 600, 400);
            
            // set the stage with the new scene (Main Menu)
            mainStage.setScene(scene);
            mainStage.setTitle("Your Personality Result");
            mainStage.show();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
