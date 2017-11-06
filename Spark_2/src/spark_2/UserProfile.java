/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author brennaadams
 */
public class UserProfile {
    
    private String name;
    private String userPersonality;
    private String education;

    
    
    public UserProfile() {
        
        try {
            loadData();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void loadData() throws ParseException {
        
        JSONParser parser = new JSONParser();
        JSONObject data = new JSONObject();
        
        try {
            
            Object obj = parser.parse(new FileReader("data.json"));
            data = (JSONObject) obj;
            JSONArray userList = (JSONArray) data.get("users");
            
            for (Object user : userList) {
                // get the overall user data (general user object)
                JSONObject userJSON = (JSONObject) user;
                
                if(userJSON.get("Username").equals(Session.userID)) {
                
                    // grab the current user's profile data
                    JSONArray userProfile = (JSONArray) userJSON.get("Profile Info");
                    JSONObject name = (JSONObject) userProfile.get(0);
                    JSONObject personality = (JSONObject) userProfile.get(1);
                    JSONObject education = (JSONObject) userProfile.get(2);
                    
                    this.name = name.get("Name").toString();
                    this.userPersonality =  personality.get("Personality").toString();
                    this.education = education.get("Education").toString();
                    
                    System.out.println(userJSON.get("Username"));
                    System.out.println(name.get("Name"));
                    System.out.println(personality.get("Personality"));
                    System.out.println(education.get("Education"));
                    
                }
            }
            
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public String getName() {
        return name;
    }
    
     public String getUserPersonality(){
        return userPersonality;
    }
    
    public String getEducation(){
        return education;
    }
    
    
     
}
