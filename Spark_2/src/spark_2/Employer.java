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
public class Employer {
    
    private String companyName;
    private String recruiterName;
    private String recruiterEmail;
    private String address;
    
    public Employer(String newCompName, String newRecruiterName, String newRecruiterEmail, String newAddress){
        this.companyName = newCompName;
        this.recruiterName = newRecruiterName;
        this.recruiterEmail = newRecruiterEmail;
        this.address = newAddress;
    }
    
    public void print(){
        System.out.println(this.companyName);
        System.out.println(this.recruiterName);
        System.out.println(this.recruiterEmail);
        System.out.println(this.address);
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
     * @return the recruiterName
     */
    public String getRecruiterName() {
        return recruiterName;
    }

    /**
     * @param recruiterName the recruiterName to set
     */
    public void setRecruiterName(String recruiterName) {
        this.recruiterName = recruiterName;
    }

    /**
     * @return the recruiterEmail
     */
    public String getRecruiterEmail() {
        return recruiterEmail;
    }

    /**
     * @param recruiterEmail the recruiterEmail to set
     */
    public void setRecruiterEmail(String recruiterEmail) {
        this.recruiterEmail = recruiterEmail;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
}
