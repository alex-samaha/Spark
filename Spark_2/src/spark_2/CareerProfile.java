/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Scott
 */
public class CareerProfile {
    private String companyName;
    private String jobType;
    private String location;
    private JSONObject data;
    
    public CareerProfile(){
        
        try {
            loadData();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void loadData() throws ParseException {
        
        JSONParser parser = new JSONParser();
        data = new JSONObject();
        
        try {
            
            Object obj = parser.parse(new FileReader("jobs.json"));
            data = (JSONObject) obj;
            JSONArray userList = (JSONArray) data.get("users");
            
            for (Object user : userList) {
                // get the overall user data (general user object)
                JSONObject userJSON = (JSONObject) user;
                
                if(userJSON.get("Username").equals(Session.userID)) {
                    System.out.println("FOUND");
                    // grab the current user's profile data
                    JSONArray userProfile = (JSONArray) userJSON.get("Profile Info");
                    JSONObject name = (JSONObject) userProfile.get(0);
                    JSONObject companyLocation = (JSONObject) userProfile.get(1);
                    JSONObject job = (JSONObject) userProfile.get(2);
                    
                    this.companyName = name.get("CompanyName").toString();
                    this.location =  companyLocation.get("JobLocation").toString();
                    this.jobType = job.get("JobType").toString();
                    
                }
            }
            
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void saveData(String company, String jobs, String location) {
        
        JSONArray userList = (JSONArray) data.get("users");
        
        JSONObject user = new JSONObject();
        user.put("Username", Session.userID);
        
        // user inputted text
        String companyName = company;
        String availableJobs = jobs;
        String companyLocation = location;
       
        // create the individual user object
        // user will go into the userList JSON Array
        JSONObject companyJSON = new JSONObject();
        companyJSON.put("CompanyName", companyName);

        // create the user profile info JSON object
        // the profileInfo array will go into the userList array
        JSONArray profileInfo = new JSONArray();

        // create the individual profile attributes
        // the attributes will go into the profileInfo
        JSONObject jobsJSON = new JSONObject();
        jobsJSON.put("JobType", availableJobs);

        JSONObject locationJSON = new JSONObject();
        locationJSON.put("JobLocation", companyLocation);


        profileInfo.add(companyJSON);
        profileInfo.add(jobsJSON);
        profileInfo.add(locationJSON);

        user.put("Profile Info", profileInfo);
        
        userList.add(user);
        
        
        data.put("users", userList);


        try {
            // write the contents to a file
            FileWriter file = new FileWriter("jobs.json");
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
    
    /**
     * @return the jobs data
     */
    public JSONObject getJobsData() {
        return data;
    }
    
    
    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the availableJobs
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * @param availableJobs the availableJobs to set
     */
    public void setJobType(String type) {
        this.jobType = type;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
}
