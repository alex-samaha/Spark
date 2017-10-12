/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark;

/**
 *
 * @author Scott
 */
public class CareerProfile {
    private String chosenPersonality;
    private String description;
    
    public CareerProfile(String aChosenPersonality, String aDescription){
        this.chosenPersonality = aChosenPersonality;
        this.description = aDescription;
    }
    
    public boolean personalityExist(){
        if(this.chosenPersonality.equals("Nerd")){
            return true;
        }
        else{
            return false;
        }
    }
    
    //*************************SETTERS AND GETTERS BELOW********************************************

    /**
     * @return the chosenPersonality
     */
    public String getChosenPersonality() {
        return chosenPersonality;
    }

    /**
     * @param chosenPersonality the chosenPersonality to set
     */
    public void setChosenPersonality(String chosenPersonality) {
        this.chosenPersonality = chosenPersonality;
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
