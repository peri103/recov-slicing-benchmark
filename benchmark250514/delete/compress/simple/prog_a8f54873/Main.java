import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        // Initialize the GzipParameters object
        GzipParameters gzipParams = new GzipParameters();
        
        // Prepare the extra data to be written
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        // Write the extra data using setExtra method
        /* write */ gzipParams.setExtra(extraData);
        
        // Read the extra data using getExtra method
        /* read */ byte[] readData = gzipParams.getExtra();
        
        // Print the read data to verify it matches the written data
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}