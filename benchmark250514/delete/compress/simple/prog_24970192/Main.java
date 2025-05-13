import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        Date modificationTime = new Date();
        
        /* write */ gzipParameters.setModificationTime(modificationTime);
        /* read */ Date readModificationTime = gzipParameters.getModificationTime();
        
        System.out.println("Modification Time: " + readModificationTime);
    }
}