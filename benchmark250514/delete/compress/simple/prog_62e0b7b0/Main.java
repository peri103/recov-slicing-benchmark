import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            byte[] dummyData = new byte[100]; // Dummy data for initialization
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(dummyData);
            BZip2CompressorInputStream bzip2InputStream = new BZip2CompressorInputStream(byteArrayInputStream);

            /* write */ bzip2InputStream.setStreamSize(1024);

            /* read */ int streamSize = bzip2InputStream.getStreamSize();
            System.out.println(streamSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}