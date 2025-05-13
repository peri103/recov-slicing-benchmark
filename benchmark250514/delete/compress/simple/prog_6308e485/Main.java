import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the BZip2CompressorInputStream with a dummy InputStream
            BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(System.in);

            // Set block size using the write method
            /* write */ bzip2Stream.setBlockSize(900000);

            // Read the block size using the read method
            /* read */ int blockSize = bzip2Stream.getBlockSize();

            // Print the block size
            System.out.println(blockSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}