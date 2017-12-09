/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author ags12
 */
public class JobSearchUICntl {
    
    private Stage mainStage;
    private NavigationCntl theNavigationCntl;
    private JobList theJobList;
    private JobPageCntl theJobPageCntl;
    
    @FXML private Button homeButton;
    @FXML private Button searchButton;
    @FXML private TextField searchTerm;
    @FXML private Label searchError;
    @FXML private TableView<Job> jobTable;
    @FXML private TableColumn<Job, String> jobTitleColumn;
    @FXML private TableColumn<Job, String> companyColumn;
    @FXML private TableColumn<Job, String> personalityColumn;
    
    @FXML public void loadMainMenu(ActionEvent event) {
        
        //get the current stage
        mainStage = (Stage) homeButton.getScene().getWindow();
        
        // create NavigationCntl object to setup scene
        theNavigationCntl = new NavigationCntl(mainStage);
    }
    
    @FXML public void search(ActionEvent event) {
        // get the user entered search term
        String search = searchTerm.getText();
        
        // create new list to populate the table with\
        ObservableList<Job> newJobList = FXCollections.observableArrayList();
        
        // loop through the job names to check if the search matches any
        for(int i = 0; i < theJobList.getJobData().size(); i++) {
            Job currentJob = theJobList.getJobData().get(i);
            if(currentJob.getJobTitle().contains(search)) {
                newJobList.add(theJobList.getJobData().get(i));
            }
        }
        if(newJobList.isEmpty()) {
            searchError.setText("No results from the search term");
        }
        else {
            searchError.setText("");
            jobTable.setItems(newJobList);
        }
        
    }
    
    @FXML
    private void loadJobPage() {
        Job job = jobTable.getSelectionModel().getSelectedItem();
        Session.theJob = job;
        
        mainStage = (Stage) jobTable.getScene().getWindow();
        theJobPageCntl = new JobPageCntl(mainStage);
        
    }
    
    
    
    @FXML
    private void initialize() {
        
        theJobList = new JobList();
        
        // Initialize the job table
        jobTitleColumn.setCellValueFactory(cellData -> cellData.getValue().jobTitleProperty());
        companyColumn.setCellValueFactory(cellData -> cellData.getValue().companyNameProperty());
        personalityColumn.setCellValueFactory(cellData -> cellData.getValue().personalityTypeProperty());
        
        jobTable.setItems(theJobList.getJobData());
        
        
    }

    
    
    
    
}
