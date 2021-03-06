
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
 * FXML Controller class
 *
 * @author ags12
 */
public class NavigationCntl {

    /**
     * Initializes the controller class.
     */
    
    private Stage mainStage;
    private JobList theJobList;
    
    public NavigationCntl(Stage currentStage) {
        
        mainStage = currentStage;
        setupNavigationScene();
    }
    
    public void setupNavigationScene() {
        
        Parent root;
        Scene scene;
        
        try {
            // load the new fxml file
            root = FXMLLoader.load(getClass().getResource("NavigationUI.fxml"));
            scene = new Scene(root, 600, 400);
            scene.getStylesheets().add(getClass().getResource("Navigation.css").toExternalForm());
            
            // set the stage with the new scene (Main Menu)
            mainStage.setScene(scene);
            mainStage.setTitle("Spark Main Menu");
            mainStage.show();
            //this.theJobList = new JobList();
            
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public JobList returnTheJobList(){
        return this.theJobList;
    }
    
    public void addJob(Job e){
        this.theJobList.add(e);
    }
    
    
}
