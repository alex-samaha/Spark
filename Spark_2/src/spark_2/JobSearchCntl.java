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
public class JobSearchCntl {
    
    private Stage mainStage;
    
    public JobSearchCntl(Stage currentStage) {
        
        this.mainStage = currentStage;
        setupJobSearchScene();
        
    }
    
    public void setupJobSearchScene() {
        
        Parent root;
        Scene scene;
        
        try {
            // load the new fxml file
            root = FXMLLoader.load(getClass().getResource("JobSearchUI.fxml"));
            scene = new Scene(root, 600, 400);
            
            // set the stage with the new scene (Main Menu)
            mainStage.setScene(scene);
            mainStage.setTitle("Job Search");
            mainStage.show();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
