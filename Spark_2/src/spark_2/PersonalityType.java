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
    
    public static String name;
    public static String description;
    
    
    public PersonalityType(double num){
        if(num > 0 && num <= 1){
            name = "Stable";
            description = "You are a stable individual. \nYou are not likely to give way or overturn\n. You are firmly fixed on what you think is right.";
        }
        else if(num > 1 && num <= 2){
            name = "Independent";
            description = "You are an independent individual\n. You are free from outside control\n and do not depend on the authority of others.";
        }
        else{
            name = "Critical Thinker";
            description = "You are a critical thinker, meaning that you form\n your judgements based on rational, skeptical, unbiased analysis\n or evaluation of factual evidence.";
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
