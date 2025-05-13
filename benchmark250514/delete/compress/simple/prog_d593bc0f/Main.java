import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        // Initializing a dummy InputStream, as BZip2CompressorInputStream requires an InputStream.
        InputStream dummyInputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return -1; // Return end of stream indicator
            }
        };

        try {
            BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(dummyInputStream);

            /* write */ bzip2Stream.setBlockSize(900000); // Set the block size to 900000

            /* read */ int blockSize = bzip2Stream.getBlockSize(); // Get the block size

            System.out.println(blockSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}