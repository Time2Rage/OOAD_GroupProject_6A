package com.tempsys;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Person{

    public static List<Manager> MANAGER_LIST = new ArrayList<>();
    private final int managerID;

    public Manager(String name,String password)
    {
        ID++;
        this.managerID = Integer.parseInt("1" + ID);
        this.name = name;
        this.password = password;
        this.setActive(true);
        MANAGER_LIST.add(this);
    }

    public int getManagerID()
    {
        return this.managerID;
    }

    public void listJobs()
    {
        System.out.println(Job.JOB_LIST.toString());
    }
    public void listWorker() { System.out.println(Worker.WORKER_LIST.toString());}

    public void assignWorkforce(Worker[] workforce, String jobID)
    {
        try {
            int index = Job.JOB_LIST.indexOf(Job.findJob(jobID));
            Job.JOB_LIST.get(index).assignWorkforce(List.of(workforce));
        }
        catch (NullPointerException npe)
        {
            System.out.println("Failed to assign workforce! Job or Workforce not valid");
        }

    }

    @Override
    public void sendMessage(int senderID, int receiverID, String message)
    {}
}
