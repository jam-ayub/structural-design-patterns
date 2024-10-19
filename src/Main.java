import decorator.CloudStream;
import decorator.CompressedCloudStream;
import decorator.EncryptedCloudStream;
import decorator.Stream;

public class Main {
    public static void main(String[] args) {
        var cloudstream = new CloudStream();
        var compressed = new CompressedCloudStream(cloudstream);
        var encrypt = new EncryptedCloudStream(compressed);
        storeCreditCard(encrypt);
    }

    private static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}