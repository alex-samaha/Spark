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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author ags12
 */
public class LoginCntl implements Initializable {
    
    private UserList theUserList;
    private Stage mainStage;
    private Parent root;
    private NavigationCntl theNavigationCntl;
    
    @FXML private Label label;
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private Label loginLabel;    
    @FXML private Button button;

    
    @FXML
    public void requestAuthenticate(ActionEvent event) {
        
        theUserList = new UserList();
        String theUsername = username.getText();
        char[] thePassword = password.getText().toCharArray();
        boolean authenticated = false;
        
        if(theUserList.authenticate(theUsername, thePassword)) {
            loginLabel.setText("Login Successful!");
            getNavCntrl();
        }
        
        else {
            loginLabel.setText("Login Failed");
        }
    }
    
    public void getNavCntrl() {
        try {
            // get the Stage from the old window in order to switch it up
            mainStage = (Stage) button.getScene().getWindow();
            // create new Parent object - this holds the new scene
            root = (Parent) FXMLLoader.load(getClass().getResource("NavigationUI.fxml"));
            
            // set the new scene
            Scene scene = new Scene(root, 600, 400);
            
            // load the CSS for the main menu
            scene.getStylesheets().add(LoginCntl.class.getResource("Navigation.css").toExternalForm());
            
            // set the stage with the new scene (Main Menu)
            mainStage.setScene(scene);
            mainStage.setTitle("Spark Main Menu");
            mainStage.show();
        }
        
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    @FXML public void cancelLogin(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
