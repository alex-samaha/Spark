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
    private PersonalityType thePersonalityType;
    
    public static double personalityScore;
    
    public PersonalityTest(String q1, String q2, String q3, String q4){
        this.question1 = q1;
        this.question2 = q2; 
        this.question3 = q3;
        this.question4 = q4;
    }
    
    public double personalityNum(){
        double myNum = 0;
        myNum += Double.parseDouble(question1);
        myNum += Double.parseDouble(question2);
        myNum += Double.parseDouble(question3);
        myNum += Double.parseDouble(question4);
        myNum = myNum/4;
        
        personalityScore = myNum;
        
        return myNum;
    }
    
    public PersonalityType getPersonalityType(double num){
        thePersonalityType = new PersonalityType(num);
        return thePersonalityType;
    }
    
    
}
