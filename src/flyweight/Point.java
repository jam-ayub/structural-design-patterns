package flyweight;

public class Point {
    private int x;
    private int y;
    private PointType pointType;
    private byte[] icon;


    public Point(int x, int y, PointType pointType, byte[] icon) {
        this.x = x;
        this.y = y;
        this.pointType = pointType;
        this.icon = icon;
    }

    public void draw() {
        System.out.printf("%s at (%d, %d)", pointType, x, y);
    }
}
