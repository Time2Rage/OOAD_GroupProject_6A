package tempsys;

public interface ICommunication {
    void sendMessage(int senderID, int receiverID, String message);
}
