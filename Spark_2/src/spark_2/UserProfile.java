/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

/**
 *
 * @author brennaadams
 */
public class UserProfile {
    
    public String name;
    public String userPersonality;
    public String education;

    public UserProfile(String aName, String aUserPersonality, String aEducation) {
        this.name = aName;
        this.userPersonality = aUserPersonality;
        this.education = aEducation;
    }
     public boolean UserPersonality(){
        return userPersonality.equals("Corageous") ||userPersonality.equals("Nerd");
    }
    
    public boolean EducationHistory(){
        return education.equals("Bachelor's Degree") || education.equals ("Associate's Degree") || education.equals("GED") || education.equals("Master's Degree") || education.equals("None");
        
        
    }
    
     
}
