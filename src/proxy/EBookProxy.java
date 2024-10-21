package proxy;

public class EBookProxy implements EBook {
    private String fileName;
    private RealEBook realEBook;

    public EBookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(realEBook == null)
            realEBook = new RealEBook(fileName);

        realEBook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
