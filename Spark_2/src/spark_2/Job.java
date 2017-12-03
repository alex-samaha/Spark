/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark_2;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */

public class Job {

    private final StringProperty jobTitle;
    private final StringProperty company;
    private final StringProperty personalityType;
 

    /**
     * Default constructor.
     */
//    public Job() {
//        this(null, null);
//    }

    /**
     * Constructor with some initial data.
     * 
     * @param title
     * @param companyName
     * @param personality
     */
    public Job(String title, String companyName, String personality) {
        this.jobTitle = new SimpleStringProperty(title);
        this.company = new SimpleStringProperty(companyName);
        this.personalityType = new SimpleStringProperty(personality);

    
    }

    public String getJobTitle() {
        return jobTitle.get();
    }

    public void setJobTitle(String title) {
        this.jobTitle.set(title);
    }

    public StringProperty jobTitleProperty() {
        return jobTitle;
    }

    public String getCompanyName() {
        return company.get();
    }

    public void setCompanyName(String companyName) {
        this.company.set(companyName);
    }

    public StringProperty companyNameProperty() {
        return company;
    }

    public String getPersonalityType() {
        return personalityType.get();
    }

    public void setPersonalityType(String personality) {
        this.personalityType.set(personality);
    }

    public StringProperty personalityTypeProperty() {
        return personalityType;
    }
    
}