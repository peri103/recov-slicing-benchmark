import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        // Set the modification time using the write method
        Date modificationTime = new Date();
        /* write */ gzipParameters.setModificationTime(modificationTime);
        
        // Retrieve the modification time using the read method
        /* read */ Date retrievedTime = gzipParameters.getModificationTime();
        
        System.out.println("Modification Time: " + retrievedTime);
    }
}