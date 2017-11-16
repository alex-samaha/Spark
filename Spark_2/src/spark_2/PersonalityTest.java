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
public class PersonalityTest {
    
    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;
    
    public PersonalityTest(String q1, String q2, String q3, String q4, String q5){
        this.question1 = q1;
        this.question2 = q2; 
        this.question3 = q3;
        this.question4 = q4;
        this.question5 = q5;
    }
    
    public void FirstQuestion(){
        if ((question1.equals(true) && (question2.equals(true)) && (question3.equals(true)) && (question4.equals(true)) && question5.equals(true))) {
        
            System.out.println("");
        
        }
        
    }
    
    
}
