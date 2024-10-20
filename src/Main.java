
import facade.NotificationService;
import flyweight.PointIconFactory;
import flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        var pointIconFactory = new PointIconFactory();

        var pointService = new PointService(pointIconFactory);

        for (var point : pointService.getPoints()) {
            point.draw();
        }
    }
}