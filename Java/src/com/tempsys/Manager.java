package com.tempsys;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Person{

    private int managerID;

    public Manager(String name,String password)
    {
        ID++;
        this.managerID = Integer.getInteger("1" + ID);
        this.name = name;
        this.password = password;
        this.setActive(true);
    }

    public int getManagerID()
    {
        return this.managerID;
    }

    public List<Job> listJobs()
    {
        return Job.JOB_LIST;
    }

    public List<Worker> createWorkforce()
    {
        List<Worker> workforce = new ArrayList<Worker>();
        workforce.add(Worker.WORKER_LIST.get(0));
        return workforce;
    }
    @Override
    public void sendMessage(int senderID, int receiverID, String message)
    {}
}
