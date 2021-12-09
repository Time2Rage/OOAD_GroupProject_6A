package com.tempsys;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Job {
    /*
    * ATTRIBUTE SECTION
     */
    public static List<Job> JOB_LIST;   //Decided to use List instead of Array, Easier to access
    // Added
    private final String jobUID;
    private String jobTitle;    // Added for more realistic job handling
    private String description;

    private Industry industry;
    private Company employer;
    private String review;

    /*
    * CONSTRUCTOR
     */
    public Job(String jobTitle, Industry industry, Company employer, String description)
    {
        this.jobUID = "" + employer.getCoID() + "." + employer.getJobOffered();     //i.e. Paypal(id=2) Job 5 = 2.5
        // Added
        this.jobTitle = jobTitle;
        // Agreed
        this.industry = industry;
        this.employer = employer;
        this.description = description;

        // Validation
        Scanner ui = new Scanner(System.in);
        System.out.println("Please confirm these information are correct (Y): \n" +
                jobTitle + industry + description);
        String confirmation = ui.nextLine();
        if (confirmation.equals("y"))
        {
            JOB_LIST.add(this);
        }
        else
        {
            exit(1);
        }
        ui.close();
    }

    /*
    * GETTER AND SETTER
     */
    public String getJobUID()
    {
        return this.jobUID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Company getEmployer() {
        return employer;
    }

    public void setEmployer(Company employer) {
        this.employer = employer;
    }

    /*
    * METHOD SECTION
    * ToDo 5/12/21 - Read Review is not good in this form.
    *
     */
    public void storeReview(String review)
    {
        this.review = review;
    }
    public void readReview()
    {
        System.out.println(this.review);
    }

}
