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
public class CareerProfile {
    private String companyName;
    private String availableJobs;
    private String location;
    
    public CareerProfile(){
        
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the availableJobs
     */
    public String getAvailableJobs() {
        return availableJobs;
    }

    /**
     * @param availableJobs the availableJobs to set
     */
    public void setAvailableJobs(String availableJobs) {
        this.availableJobs = availableJobs;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
}
