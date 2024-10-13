import composite.Group;
import composite.Shape;

public class Main {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape()); // square1
        group1.add(new Shape()); // sqaure2

        var group2 = new Group();
        group2.add(new Shape()); // circle1
        group2.add(new Shape()); // circle2

        var group3 = new Group();
        group3.add(group1);
        group3.add(group2);
        group3.render();
        group3.move();
    }
}