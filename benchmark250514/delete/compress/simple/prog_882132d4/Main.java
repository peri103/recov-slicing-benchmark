import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {
        // Initialize a dummy input stream
        byte[] dummyData = new byte[0];
        InputStream inputStream = new ByteArrayInputStream(dummyData);

        try {
            BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(inputStream);

            // Set the block size
            /* write */ bzip2Stream.setBlockSize(9);

            // Read the block size
            /* read */ int blockSize = bzip2Stream.getBlockSize();

            System.out.println(blockSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}