/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ags12
 */
public class ResearchCareersUICntl implements Initializable {
    
    
    private CareerList theCareerList;
    private Stage mainStage;
    private NavigationCntl theNavigationCntl;
    
    @FXML private Button homeButton;
    @FXML private TextField searchField;
    @FXML private Label searchError;
    @FXML private TableView careerTable;
    @FXML private TableColumn<Career, String> careerColumn;
    
    
    @FXML public void loadMainMenu() {
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        theNavigationCntl = new NavigationCntl(mainStage);
    }
    
    @FXML public void search() {
        
        String searchTerm = searchField.getText();
        
        ObservableList<Career> newCareerList = FXCollections.observableArrayList();
        
        // loop through the careers to check if the search matches any
        for(int i = 0; i < theCareerList.getCareerData().size(); i++) {
            Career currentCareer = theCareerList.getCareerData().get(i);
            if(currentCareer.getTitle().contains(searchTerm)) {
                newCareerList.add(currentCareer);
            }
        }
        
        // filter the results (if any)
        if(newCareerList.isEmpty()) {
            searchError.setText("No results from the search term");
        }
        else {
            searchError.setText("");
            careerTable.setItems(newCareerList);
        }
        
    }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // load in the career list
        theCareerList = new CareerList();
        
        // initialize the career table
        careerColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
        
        // fill in the table
        careerTable.setItems(theCareerList.getCareerData());
        
    }    
    
}
