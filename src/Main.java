import decorator.CloudStream;
import decorator.CompressedCloudStream;
import decorator.EncryptedCloudStream;
import decorator.Stream;
import facade.Message;
import facade.NotificationServer;

public class Main {
    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connect("127.0.0.0");
        var authToken = server.authenticate("123", "456");
        var message = new Message("Saving Private Ryan.");
        server.sendMessage(authToken, message, "SMTP Server");

        connection.disconnect();
    }
}