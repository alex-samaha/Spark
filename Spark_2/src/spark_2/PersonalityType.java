/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

/**
 *
 * @author Scott
 */
public class PersonalityType {
    
    private String name;
    private String description;
    
    public PersonalityType(String aName, String aDescription){
        this.name = aName;
        this.description = aDescription;
    }
    
    public PersonalityType(double num){
        if(num > 0 && num <= 1){
            name = "Stable";
        }
        else if(num > 1 && num <= 2){
            name = "Independant";
        }
        else{
            name = "Critical Thinker";
        }
    }
    
    public String typicalJob(String thePT){
        if(thePT.equals("Courageous")){
            return "Fire Fighter";
        }
        else if(thePT.equals("Nerd")){
            return "Java Devloper";
        }
        else{
            return "You do not have a Personality";
        }
    }
    
    //*************************SETTERS AND GETTERS BELOW********************************************

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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
