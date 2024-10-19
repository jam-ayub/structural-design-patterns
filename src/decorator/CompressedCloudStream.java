package decorator;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressedData = compressed(data);
        stream.write(compressedData);
    }

    private String compressed(String data) {
        return data.substring(0, 5);
    }
}
