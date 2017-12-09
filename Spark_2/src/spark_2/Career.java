/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ags12
 */
public class Career {
    
    private StringProperty title;
    private StringProperty description;
    
    public Career(String theTitle, String theDescription) {
        
        this.title = new SimpleStringProperty(theTitle);
        this.description = new SimpleStringProperty(theDescription);
        
    }
    
    // getters and setters for the career data
    // need to return the data (sometimes) as a SimpleStringProperty to be put into a table view
    
    
    public String getTitle() {
        return title.get();
    }
    
    public StringProperty titleProperty() {
        return title;
    }
    
    public String getDescription() {
        return description.get();
    }
    
    public StringProperty descriptionProperty() {
        return description;
    }
    
}
