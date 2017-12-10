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
 * @author Scott
 */
public class User {
    
    private String name;
    private char[] password;
    private String userType;
    private String personalityType;
    
    public User(String aUser, char[] aPassword){
        this.name = aUser;
        this.password = aPassword;
    }
    
    public User() {
        
        try {
            loadData();
        }
        catch (Exception e) {
            e.printStackTrace();
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
                    JSONObject type = (JSONObject) userProfile.get(3);
                    
                    JSONObject personality = (JSONObject) userProfile.get(1);
               
                    this.personalityType = personality.get("Personality").toString();
                    this.userType = type.get("UserType").toString();
                    System.out.println(userType);
                    
                }
            }
            
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * @return the user type
     */
    public String getUserType() {
        return userType;
    }
    
    
    public String getPersonalityType(){
        return this.personalityType;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public char[] getPassword() {
        return this.password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(char[] aPassword) {
        this.password = aPassword;
    }
}
