import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class Main {
    public static void main(String[] args) {
        // Initialize the BZip2CompressorInputStream object
        BZip2CompressorInputStream bzip2InputStream = new BZip2CompressorInputStream(System.in);

        // Set the block size using the write method
        /* write */ bzip2InputStream.setBlockSize(9);

        // Read the block size using the read method
        /* read */ int blockSize = bzip2InputStream.getBlockSize();

        // Print the block size to verify
        System.out.println(blockSize);
    }
}