package com.tempsys;

public class SysAdmin extends Person{

    public SysAdmin(String name, String password)
    {
        ID++;
        this.name = name;
        this.password = password;
        this.setActive(true);
    }

    public void resetPassword(int id)
    {
        switch (getClass(id))
        {
            case 1:
                for (Manager user: Manager.MANAGER_LIST)
                {
                    if (user.getManagerID() == id)
                    {
                        user.setPassword("openSesame123!");
                    }
                }
                break;
            case 3:
                for (Worker user: Worker.WORKER_LIST)
                {
                    if (user.getWorkerID() == id)
                    {
                        user.setPassword("openSesame123!");
                    }
                }
                break;

        default:
            break;
        }
    }

    public void resetUsername(int id)
    {
        switch (getClass(id))
        {
            case 1:
                for (Manager user: Manager.MANAGER_LIST)
                {
                    if (user.getManagerID() == id)
                    {
                        user.setPassword("openSesame123!");
                    }
                }
                break;
            case 3:
                for (Worker user: Worker.WORKER_LIST)
                {
                    if (user.getWorkerID() == id)
                    {
                        user.setPassword("openSesame123!");
                    }
                }
                break;

            default:
                break;
        }
    }

    public void setAccountStatus(int id)
    {

    }

    public int getClass(int id)
    {
        int ident;
        if (id > 1000)
        {
            ident = id / 100;
        }
        else
        {
            ident = id / 10;
        }
        return ident;
    }

    @Override
    public void sendMessage(int senderID, int receiverID, String message)
    {}
}

