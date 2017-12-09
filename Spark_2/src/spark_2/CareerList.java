/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ags12
 */
public class CareerList {
    
    
    private ObservableList<Career> careerList;
    
    public CareerList() {
        if(careerList == null) {
            buildList();
        }
    }
    
    // builds the career list
    private void buildList() {
        careerList = FXCollections.observableArrayList();
        
        // add all of the careers in
        Career sofEng = new Career("Software Engineering", "A software engineer "
                                   + "is a person who applies the principles of "
                                   + "software engineering to the design, development, "
                                   + "maintenance, testing, and evaluation of the "
                                   + "software that make computers or other devices containing software work.");
        
        Career webDev = new Career("Web Development", "A web developer is a programmer who "
                                   + "specializes in, or is specifically engaged in, the development "
                                   + "of World Wide Web applications, or applications that are run over "
                                   + "HTTP from a web server to a web browser.");
        
        careerList.addAll(sofEng, webDev);
        
    }
    
    public ObservableList<Career> getCareerData() {
        return careerList;
    }
    
}
