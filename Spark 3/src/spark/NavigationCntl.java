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
public class NavigationCntl {
    
    private NavigationUI theNavigationUI = null;
    
    public NavigationCntl(){
        theNavigationUI = new NavigationUI();
        theNavigationUI.setLocationRelativeTo(null);
        theNavigationUI.setVisible(true);
    }
    
}
