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
        
        if(theUserList.authenticate(theUsername, thePassword)) {
            Session.userID = theUsername;
            loginLabel.setText("Login Successful!");
            getNavCntrl();
        }
        
        else {
            loginLabel.setText("Login Failed");
        }
    }
    
    public void getNavCntrl() {
        // get the Stage from the old window in order to switch it up
        mainStage = (Stage) button.getScene().getWindow();
        
        // create instance of nav controller to load main menu
        theNavigationCntl = new NavigationCntl(mainStage);
            
           
    }
    
    @FXML public void cancelLogin(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
