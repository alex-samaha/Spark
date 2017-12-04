/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Scott
 */
public class JobList {
    private ObservableList<Job> jobList;
    private JSONObject data;
    
    public JobList(){
        
        try {
            jobList = FXCollections.observableArrayList();
            this.loadData();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        if(jobList == null){
            this.buildList();
        }
    }
    
    public void loadData() throws ParseException{
        JSONParser parser = new JSONParser();
        data = new JSONObject();
        
        try{
            Object obj = parser.parse(new FileReader("job_list.json"));
            data = (JSONObject) obj;
            JSONArray theJobList = (JSONArray) data.get("jobs");
            
            for(Object job : theJobList){
                
                JSONArray currentJob = (JSONArray) job;
                JSONObject compName = (JSONObject) currentJob.get(0);
                JSONObject persType = (JSONObject) currentJob.get(1);
                JSONObject jobTitle = (JSONObject) currentJob.get(2);
                
                String name = compName.get("CompanyName").toString();
                String personality = persType.get("PersonalityType").toString();
                String title = jobTitle.get("JobTitle").toString();
                
                Job newJob = new Job(title, name, personality);
                this.jobList.add(newJob);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void buildList(){
        this.jobList = FXCollections.observableArrayList();
        
        for (int i = 0; i < 10; i++) {
            Job tempJob = new Job("Title " + i, "Company " + i, "Critical Thinker");
            this.jobList.add(tempJob);
        }
    }
    
    public ObservableList<Job> getJobData() {
        return jobList;
    }
    
    public Job getJob(int i){
        return this.jobList.get(i);
    }
    
    public void add(Job job){
        this.jobList.add(job);
        
        JSONParser parser = new JSONParser();
        data = new JSONObject();
        
        try {
            
            Object obj = parser.parse(new FileReader("job_list.json"));
            data = (JSONObject) obj;
            
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
        
        save(job);
        
    }
    
    public void save(Job job) {
        
        JSONArray jobList = (JSONArray) data.get("jobs");
        
        
        JSONObject jobTitle = new JSONObject();
        jobTitle.put("JobTitle", job.getJobTitle());
        
       
        JSONObject companyName = new JSONObject();
        companyName.put("CompanyName", job.getCompanyName());


        JSONArray profileInfo = new JSONArray();


        JSONObject personalityType = new JSONObject();
        personalityType.put("PersonalityType", job.getPersonalityType());


        profileInfo.add(companyName);
        profileInfo.add(personalityType);
        profileInfo.add(jobTitle);
    
        
//        jobTitle.put("ProfileInfo", profileInfo);
        
        jobList.add(profileInfo);
        
        
        data.put("jobs", jobList);


        try {
            // write the contents to a file
            FileWriter file = new FileWriter("job_list.json");
            file.write(data.toJSONString());

            // flush buffer and close contents
            file.flush();
            file.close();
            
            
            System.out.println("Contents written to the file");
            

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
