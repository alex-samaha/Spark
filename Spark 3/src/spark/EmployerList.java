/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark;

import java.util.ArrayList;

/**
 *
 * @author Scott
 */
public class EmployerList implements Listable{

    private ArrayList<Employer> listOfEmplyers = null;
    
    public EmployerList(){
        if(this.listOfEmplyers == null){
            buildList();
        }
    }
    
    //*******************This will be changed when we implement serealized data*****************************
    @Override
    public void buildList() {
        this.listOfEmplyers = new ArrayList<Employer>();
        for (int i = 0; i < 5; i++) {
            Employer tempEmployer = new Employer("Company " + i, "Recruiter " + i, "recruiter@company.com", "Address " + i);
            this.listOfEmplyers.add(tempEmployer);
            
        }
    }

    @Override
    public void printList() {
        for (int i = 0; i < this.listOfEmplyers.size(); i++) {
            System.out.println("");
            this.listOfEmplyers.get(i).print();
            
        }

    }
    
}
