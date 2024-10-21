import proxy.EBookProxy;
import proxy.Library;
import proxy.LoggingEBookProxy;
import proxy.RealEBook;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c", "d"};
        for(var fileName : fileNames) {
           library.add(new LoggingEBookProxy(fileName));
        }

        library.openEBook("a");
        library.openEBook("b");
    }
}