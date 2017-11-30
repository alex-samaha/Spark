/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Scott
 */
public class JobList {
    private ObservableList<Job> jobList;
    
    public JobList(){
        if(jobList == null){
            this.buildList();
        }
    }
    
    public void buildList(){
        this.jobList = FXCollections.observableArrayList();
        
        for (int i = 0; i < 5; i++) {
            Job tempJob = new Job("Title " + i, "Company " + i, "We want personality " + i, (i+1)*478);
            this.jobList.add(tempJob);
        }
    }
    
    public Job getJob(int i){
        return this.jobList.get(i);
    }
    
    public void add(Job e){
        this.jobList.add(e);
    }
    
}
