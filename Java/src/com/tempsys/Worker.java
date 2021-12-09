package com.tempsys;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Person{
    public static List<Worker> WORKER_LIST = new ArrayList<>();     //Decided to use List instead of Array, Easier to access
    private final int workerID;
    private CV cv;
    private Industry industry;


    public Worker(String name, String password)
    {
        ID++;
        this.workerID = Integer.parseInt("3" + ID);   // every Worker starts with 3
        this.name = name;
        this.password = password;
        this.setActive(true);

        this.cv = new CV();
        // Needs to be called last
        WORKER_LIST.add(this);
    }

    public int getWorkerID()
    {
        return this.workerID;
    }

    public CV getCv() {
        return cv;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public void updateCV(String path_to_cv)
    {
        this.cv.setLastChanged();
        this.cv.setCvDoc(path_to_cv);

    }


    @Override
    public void sendMessage(int senderID, int receiverID, String message)
    {}
}
