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
        Manager ned = new Manager("Ned Flanders","NeighborsAreTheBEst");
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

        System.out.println(Worker.WORKER_LIST.toString());





        /*

        All ready to go, the 3 scurry out to find companies interested in taking on temporary contracts.


        ...

         */


        // Manager Mike pulled CV of Worker Wallace
        System.out.println();
    }

}