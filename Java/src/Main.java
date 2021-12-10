import com.tempsys.*;

public class Main {

    public static void main(String[] args) {

        /* Tamara, Wallace and Ned decide to open a temp agency, since some of their friends struggle to find a job
        after the Corona Virus wiped a good margin of the jobs on the market. Now that everyone starts to hire again,
        but is still cautious about committing to long term contracts, they plan on keeping their friends going until
        everything is back to normal.

        Luckily Tamara is experienced in whipping up makeshift IT interfaces to get enterprises like this started.

        She set up this system, and adds herself as manager and admin
        Wallace and Ned as managers as well.
        */
        SysAdmin administrator = new SysAdmin("Tamara Yates","admin123");
        Manager tamara = new Manager("Tamara Yates","ILoveMyDog<3");
        Manager wallace = new Manager("Wallace Williams","IWasNeverInNewYork");
        Manager ned = new Manager("Ned Flanders","NeighboursAreTheBEst");
        /*

        Next the three invite all their friends to sign up.
        10 People instantly fill out their profiles, across various industries. (Using the file mockCV.txt as CV or null)
        */
        Worker w1 = new Worker("Miranda Castilla","9yMU:M");
        w1.setPicture("myPicture.png");
        w1.setIndustry(Industry.ENGINEERING);
        w1.updateCV("path_to_my_cv");

        Worker w2 = new Worker("Zuzanna Ong","#_rT6X");
        w2.setPicture("myPicture.png");
        w2.setIndustry(Industry.ADMINISTRATION);
        w2.updateCV("path_to_my_cv");

        Worker w3 = new Worker("Rikard Neil","9bT.xN");
        w3.setPicture("myPicture.png");
        w3.setIndustry(Industry.ENGINEERING);
        w3.updateCV("path_to_my_cv");

        Worker w4 = new Worker("Marlin Knopf","7_vHYx");
        w4.setPicture("myPicture.png");
        w4.setIndustry(Industry.BUILDING);
        w4.updateCV("path_to_my_cv");

        Worker w5 = new Worker("Lishan Olsen","Zaf5-5");
        w5.setPicture("myPicture.png");
        w5.setIndustry(Industry.COMPUTING);
        w5.updateCV("path_to_my_cv");

        Worker w6 = new Worker("Adrian Olsen","9pu>F?");
        w6.setPicture("myPicture.png");
        w6.setIndustry(Industry.ENGINEERING);
        w6.updateCV("path_to_my_cv");

        Worker w7 = new Worker("Astra Ongaro","x@F5QD");
        w7.setPicture("myPicture.png");
        w7.setIndustry(Industry.PROPERTY);
        w7.updateCV("path_to_my_cv");

        Worker w8 = new Worker("Thiemo Yoxall","5X$pH{");
        w8.setPicture("myPicture.png");
        w8.setIndustry(Industry.COMPUTING);
        w8.updateCV("path_to_my_cv");

        Worker w9 = new Worker("Derdriu Fowler","7NhY[x");
        w9.setPicture("myPicture.png");
        w9.setIndustry(Industry.MEDICAL_INSURANCE);
        w9.updateCV("path_to_my_cv");

        Worker w10 = new Worker("Kasper Osbourne","hZN)4t");
        w10.setPicture("myPicture.png");
        w10.setIndustry(Industry.MEDICAL_INSURANCE);
        w10.updateCV("path_to_my_cv");

        System.out.println(Worker.WORKER_LIST.size());
        /*
        All ready to go, the 3 scurry out to find companies interested in taking on temporary contracts. */

        Company c1 = new Company("PlyPla",Industry.MEDICAL_INSURANCE);
        Company c2 = new Company("Diddies Demmolition",Industry.BUILDING);
        Company c3 = new Company("MacroHard",Industry.COMPUTING);
        Company c4 = new Company("Tootle",Industry.COMPUTING);
        Company c5 = new Company("SweetHomeAlanBalma",Industry.PROPERTY);

        // Diddies realized they had made a typo in their company. An Apprentice was scolded and the name fixed quickly
        c2.setCompanyName("Diddies Demolition");
        /*
        The system was in full setup. So the companies started posting some jobs
         */

        // PlaPla posted 1 Job
        c1.postJob("Freelance Insurance Consultant","6 Month Employment - 3500€ per Month \n" +
                "Bonus paid in addition.");

        //Diddies posted these
        c2.postJob("Plumber", "Plumber wanted for new onsite construction in Dublin Area.\n" +
                "Payment according to unity contracts.");
        c2.postJob("4 Tiler", "Looking for tiling crew for renovation works in Cork Area.\n" +
                "Project time is agreed for 2 Month.\n" +
                "Payment according to unity contracts.");
        // MacroHard didn't post jobs initially
        // Tootle on the other hand came up with some great ideas they wanted to bring to life.
        c4.postJob("2 PHP Developer","Tootle is looking for 2 motivated PHP Developer of intermediate skill level.\n" +
                "Our senior team will guide you trough the specifics of this Project.\n" +
                "Payment to be negotiated.");
        c4.postJob("1 Senior Team Lead","We are looking for an experienced Team Lead with experience in Project Management.\n" +
                "No older than 21. 20 Years experience required.\n" +
                "Salary to be negotiated.");
        c4.postJob("4 Webdesigner","Tootle is looking for 4 motivated Webdesigner with the vision to create something spectacular \n" +
                "Our senior team will guide you trough the specifics of this Project to help make this vision come true.");
        c4.postJob("1 Database Developer","We are looking for 1 DB Developer with experience in PostGreSQL\n" +
                "Payment to be negotiated.");

        /*
        Excited by this quick development the friends started to assign the registered users for their new jobs.
        All of them being informed about their planned assignment.
        First they listed all the jobs posted on the System so far.
       */
        tamara.listJobs();
        // Second they listed all the friends registered ion their system
        tamara.listWorker();
        /* Tamara took care of all the software assignments
        First checking their CV, making sure they are qualified.
        After checking in with Lishan and Thiemo she assigned the workforce for the job
         */
        // The system would make a call like this.
        System.out.println(Worker.WORKER_LIST.get(4).getCv());
        // Satisfied she assigns them to their new workplace
        Worker[] developer = {w5,w8};
        tamara.assignWorkforce(developer,"24.1");

        // Debug : System.out.println(Job.findJob("24.1").getAssignedWorkforce());

        // Wallace used to be a foreman so construction was his thing
        Worker[] construct = {w4};
        wallace.assignWorkforce(construct,"22.1");

        // Ned, a former business consultant assigned the Medical Insurance Workers
        Worker[] consult = {w10};
        ned.assignWorkforce(consult, "21.1");

        /* Tootle then tries to revoke the Job for Senior Teamlead but clicks the wrong
        panel. Luckily Tamara anticipated this mistake.
         */

        c4.revokeJob("24.1");
        c4.revokeJob("24.2");

        /*
        After a few weeks the plumbing contract is finished. So The company sets the Job to finished state and
        composes a review.
         */
        c2.finishJob("22.1");
        c2.reviewJob("22.1", "All the work was done appropriately.\n" +
                "Marlin Knopf displayed considerable skill and absolute professionalism.\n" +
                "We are more than happy with his work and look forward to working with him again.");

        //Curious how his friend performed Wallaca checks the Job record to see the review
        System.out.println(Job.findJob("22.1").readReview());

        /*
        This brings our little story to an end. A system is implemented that serves a purpose, only in need of a decent interface and database.
         */
    }

}