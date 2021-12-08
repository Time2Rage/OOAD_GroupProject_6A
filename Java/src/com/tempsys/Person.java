package com.tempsys;

public abstract class Person implements ICommunication{
    protected static int ID = 0;
    protected String name;
    protected String picture;
    protected String password;
    protected boolean isActive;

    public Person()
    {
        ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void sendMessage(int senderID, int receiverID, String message)
    {}
}
