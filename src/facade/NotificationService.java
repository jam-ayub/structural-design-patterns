package facade;

public class NotificationService {
    public void send(String messageToSend, String target) {
        var server = new NotificationServer();
        var connection = server.connect("127.0.0.0");
        var authToken = server.authenticate("123", "456");
        var message = new Message(messageToSend);

        server.sendMessage(authToken, message, target);

        connection.disconnect();
    }
}
