/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Scott
 */
public class LoginUI extends JFrame{
    private LoginCntl parentLoginCntl = null;
    
    public LoginUI(LoginCntl newParentLoginCntl){
        parentLoginCntl = newParentLoginCntl;
        
        this.setSize(400, 300);
        this.setTitle("My Window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JPanel thePanel = new JPanel();
        thePanel.setLayout(new GridLayout(4,4));
        
        JPanel[] cellNumbers = new JPanel[16]; // create cell numbers for the GridLayout
        for(int i = 0; i < 16; i++){
            JPanel nextPanel = new JPanel();
            cellNumbers[i]= nextPanel;
            thePanel.add(nextPanel);
        }
        
        JButton cancelButton = new JButton("Cancel");
            cancelButton.setSize(30,40);
            cancelButton.addActionListener(new CancelListener());
            
        JButton submitButton = new JButton("Submit");
            submitButton.setSize(30,40);
            
        /*JButton createUserButton = new JButton("Create User");
            createUserButton.setSize(30,40);
            createUserButton.addActionListener(new CreateListener());*/
            
            
            //Fields
            JTextField usernameField = new JTextField("Name 1");
            usernameField.setColumns(8);
            JPasswordField passwordField = new JPasswordField("PW1");
            passwordField.setColumns(8);
            
            //Labels
            JLabel usernameLabel = new JLabel("Username");
            JLabel passwordLabel = new JLabel("Password");
            JLabel titleLabel = new JLabel("Login");
            
            //assembly
            cellNumbers[14].add(cancelButton);
            cellNumbers[15].add(submitButton);
            //cellNumbers[13].add(createUserButton);
            cellNumbers[5].add(usernameLabel);
            cellNumbers[6].add(usernameField);
            cellNumbers[9].add(passwordLabel);
            cellNumbers[10].add(passwordField);
            cellNumbers[2].add(titleLabel);
            this.add(thePanel);
           
             submitButton.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent evt){
                     
                        String username = usernameField.getText();
                        char[] password = passwordField.getPassword();
                        boolean authenticated = parentLoginCntl.requestAuthenticate(username, password); //*************IMPORTANT***************
                        if(authenticated){
                            System.out.println("Authenticated");
                            parentLoginCntl.requestNavigationCntl();

                        }else{
                            System.out.println("NOT Authenticated");
                        }
                }
            });
    }
    
    class CancelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.exit(0);
        }
    }
    
    class SubmitListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            
        }
    }
    
}
