import org.apache.commons.compress.compressors.gzip.GzipParameters;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize the GzipParameters object
        GzipParameters gzipParameters = new GzipParameters();
        
        // Create a Date object representing the current time
        Date currentTime = new Date();
        
        // Use the write method to set the modification time
        /* write */ gzipParameters.setModificationTime(currentTime);
        
        // Use the read method to get the modification time
        /* read */ Date modificationTime = gzipParameters.getModificationTime();
        
        // Print the modification time to verify
        System.out.println(modificationTime);
    }
}