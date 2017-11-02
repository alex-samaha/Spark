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

    public UserProfile(String aname, String auserPersonality, String aeducation) {
        this.name = aname;
        this.userPersonality = auserPersonality;
        this.education = aeducation;
    }
    
}
