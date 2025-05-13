import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GzipParameters parameters = new GzipParameters();
        Date modificationTime = new Date(); // Initialize with the current date and time
        
        /* write */ parameters.setModificationTime(modificationTime);
        
        /* read */ Date readModificationTime = parameters.getModificationTime();
        
        System.out.println("Modification Time: " + readModificationTime);
    }
}