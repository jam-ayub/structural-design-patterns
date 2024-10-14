import adapter.*;
import adapter.avaFilter.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter()); // applying vivid filter
        imageView.apply(new CaramelFilter(new Caramel())); // using composition (caramelFilter composed of Caramel) | applying caramel using 3rd party library and extending filter interface
        imageView.apply(new CaramelAdapter()); // applying caramel filter using inheritance
    }
}