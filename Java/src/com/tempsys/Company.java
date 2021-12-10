package com.tempsys;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static List<Company> COMPANY_LIST = new ArrayList<>();
    private static int CO_ID = 0;
    private final int coID;
    private String companyName;
    private Industry industry;

            // Job counter for jobUID
    private int jobOffered = 0;

    public Company(String name, Industry industry){
       CO_ID++;
       this.coID = Integer.parseInt("2" + CO_ID);    // make every company start with a 2
       this.companyName = name;
       this.industry = industry;
       COMPANY_LIST.add(this);
    }

    public int getCoID()
            {
                return this.coID;
            }

    public String getCompanyName() {
            return companyName;
        }

    public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

    public Industry getIndustry() {
            return industry;
        }

    public void setIndustry(Industry industry) {
            this.industry = industry;
        }

    public int getJobOffered()
        {
            return this.jobOffered;
        }

    // Jobs
    public void postJob(String title, String description)
    {
       jobOffered++;
       Job nJob = new Job(title,industry,this,description);
    }

    public void revokeJob(String uid)
    {
        try {
            Job rJob = Job.findJob(uid);
            if (rJob != null && rJob.getAssignedWorkforce().isEmpty())
            {
                Job.JOB_LIST.remove(rJob);
                System.out.println("Removed job from List");
            }
            else{
                System.out.println("Can't delete a job in progress");
            }
        }
        catch(NullPointerException npe)
        {
            System.out.println("Job not existent!");
        }
    }
    public void  finishJob(String uid)
    {
        try {
            Job.findJob(uid).setFinished(true);
        }
        catch (NullPointerException npe)
        {
            System.out.println("Job not in List! Check uid!");
        }
    }

    public void reviewJob(String uid, String review)
    {
        try {
            if (Job.findJob(uid).isFinished()) {
                Job.findJob(uid).storeReview(review);
            }
            else {
                System.out.println("Can't review a job still in progress!");
            }
        }
        catch (NullPointerException npe)
        {
            System.out.println("Job not in List! Check uid!");
        }

    }
}
