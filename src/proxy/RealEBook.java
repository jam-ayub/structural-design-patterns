package proxy;

public class RealEBook implements EBook {
    private final String fileName;

    @Override
    public String getFileName() {
        return fileName;
    }

    public RealEBook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebook: " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing ebook: " + fileName);
    }
}
