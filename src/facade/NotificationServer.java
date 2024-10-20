package facade;

public class NotificationServer {
    // connect
    // authenticate
    // sendMessage
    // disconnect

    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appId, String Key) {
        return new AuthToken();
    }

    public void sendMessage(AuthToken authToken, Message message, String target) {
        System.out.println("Sending Message: " + message.content);
    }


}
