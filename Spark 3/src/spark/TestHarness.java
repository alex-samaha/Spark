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
public class TestHarness {

    
    public TestHarness(){
        //Tests the User Class
        System.out.println("\nTest the PersonalityType class\n");
                
        User testUser = new User("Dan", ("PW").toCharArray());
        
        if(testUser != null){
            System.out.println("The constructor works");
        }
        else{
            System.out.println("The constructor fails");
        }
        
        if(testUser.getName().equals("Dan")){
            System.out.println("Test getName works");
        }
        else{
            System.out.println("Test getName fails");
        }

        //Test the PersonalityType class
        System.out.println("\nTest the PersonalityType class\n");
        
        PersonalityType testPersonalityType = new PersonalityType("Grouch", "You're a meanie");
        
        if(testPersonalityType != null){
            System.out.println("The constructor works");
        }
        else{
            System.out.println("The constructor fails");
        }
        
        if(testPersonalityType.getName().equals("Grouch")){
            System.out.println("Test getName works");
        }
        else{
            System.out.println("Test getName fails");
        }
        
        if(testPersonalityType.getDescription().equals("You're a meanie")){
            System.out.println("Test getDescription works");
        }
        else{
            System.out.println("Test getDescription fails");
        }
        
        //Test CareerProfile class
        System.out.println("\nTest the CareerProfile class\n");
        
        CareerProfile testCareerProfile = new CareerProfile("Grouch", "We are looking for a Grouch in our workplace!");
        
        if(testCareerProfile != null){
            System.out.println("The constructor works");
        }
        else{
            System.out.println("The constructor fails");
        }
        
        if(testCareerProfile.getChosenPersonality().equals("Grouch")){
            System.out.println("Test getChosenPersonality works");
        }
        else{
            System.out.println("Test getChosenPersonality fails");
        }
        
        if(testCareerProfile.getDescription().equals("We are looking for a Grouch in our workplace!")){
            System.out.println("Test getDescription works");
        }
        else{
            System.out.println("Test getDescription fails");
        }
    }
    
}
