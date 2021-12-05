package tempsys;

public class Manager extends Person{

    public Manager(String name,String password)
    {
        ID++;
        this.name = name;
        this.password = password;
        this.setActive(true);
    }



    @Override
    public void sendMessage(int senderID, int receiverID, String message)
    {};
}
