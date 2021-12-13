package com.tempsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Job {
    /*
    * ATTRIBUTE SECTION
     */
    public static List<Job> JOB_LIST = new ArrayList<>();   //Decided to use List instead of Array, Easier to access
    // Added
    private final String jobUID;
    private String jobTitle;    // Added for more realistic job handling
    private String description;
    private List<Worker> assignedWorkforce;


    private Industry industry;
    private Company employer;
    private boolean finished;
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
        this.assignedWorkforce = new ArrayList<>();
        this.finished = false;

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

    public List<Worker> getAssignedWorkforce() {
        return assignedWorkforce;
    }

    public void setAssignedWorkforce(List<Worker> assignedWorkforce) {
        this.assignedWorkforce = assignedWorkforce;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString()
    {
        return jobUID + "\n" + jobTitle + "\n" + industry + "\n" +employer.getCompanyName() + "\n" +
                "-------------------------------------\n";

    }

    /*
    * METHOD SECTION
    * ToDo 5/12/21 - Read Review is not good in this form.
    *
     */
    public void assignWorkforce(List<Worker> workforce)
    {
        this.assignedWorkforce=workforce;
    }

    public static Job findJob(String uid)
    {
        for (Job job: JOB_LIST
             ) {
            if (job.getJobUID().equals(uid))
            {
                return job;
            }
        }
        System.out.println("Job not in List!");
        return null;
    }


    public void storeReview(String review)
    {
        this.review = review;
    }
    public String readReview()
    {
        return this.review;
    }



}
