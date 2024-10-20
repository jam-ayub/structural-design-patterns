
import facade.NotificationService;
import flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        var pointService = new PointService();

        for (var point : pointService.getPoints()) {
            point.draw();
        }
    }
}