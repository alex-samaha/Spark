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
public class User {
    
    private String name;
    private char[] password;
    
    public User(String aUser, char[] aPassword){
        this.name = aUser;
        this.password = aPassword;
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
