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
public class Job {
    private String jobTitle;
    private String companyName;
    private String description;
    private int yearlySalary;
    
    public Job(String aJobTitle, String aCompanyName, String aDescription, int aYearlySalary){
        this.jobTitle = aJobTitle;
        this.companyName = aCompanyName;
        this.description = aDescription;
        this.yearlySalary = aYearlySalary;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the yearlySalary
     */
    public int getYearlySalary() {
        return yearlySalary;
    }

    /**
     * @param yearlySalary the yearlySalary to set
     */
    public void setYearlySalary(int yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
}
