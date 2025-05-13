import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipParameters object
        GzipParameters gzipParameters = new GzipParameters();
        
        // Create a byte array to use with setExtra and getExtra methods
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        /* write */ gzipParameters.setExtra(extraData);
        /* read */ byte[] readData = gzipParameters.getExtra();
        
        // Print the read data to verify it matches the written data
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}