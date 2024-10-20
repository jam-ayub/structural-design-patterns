
import facade.NotificationService;

public class Main {
    public static void main(String[] args) {
        var notificationService = new NotificationService();
        notificationService.send("Saving Private Ryan", "Iowa");
    }
}