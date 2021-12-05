package tempsys;

import java.util.List;

public class Worker extends Person{
    public static List<Worker> WORKER_LIST;     //Decided to use List instead of Array, Easier to access
    private CV cv;
    private Industry industry;
    private String description;

    public Worker(String name, String password)
    {

        this.setActive(true);

        // Needs to be called last
        WORKER_LIST.add(this);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void sendMessage(int senderID, int receiverID, String message)
    {};
}
