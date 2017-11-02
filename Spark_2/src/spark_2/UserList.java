/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Scott
 */
public class UserList {
    
    private ArrayList<User> listOfUsers = null;
    
    public UserList(){
        if(this.listOfUsers == null){
            this.buildList();
        }
    }
    
    public void buildList(){
        this.listOfUsers = new ArrayList<User>();
        
        for (int i = 0; i < 5; i++) {
            User tempUser = new User("Name " + i, ("PW" + i).toCharArray());
            this.listOfUsers.add(tempUser);
            
        }
    }
    
    public boolean authenticate(String usernameToCheck, char[] passwordToCheck){
        
        boolean authenticated = false;
        
        for(int i = 0; i < listOfUsers.size(); i++){
            
            if(usernameToCheck.equals(listOfUsers.get(i).getName()) && Arrays.equals(passwordToCheck, listOfUsers.get(i).getPassword()) ) {
                authenticated = true;
            }
     
        }
        if(authenticated) {
            System.out.println("You're in!");
        }
      
        return authenticated;
    }
}
