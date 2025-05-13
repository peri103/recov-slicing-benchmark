import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        
        Date modificationTime = new Date();
        /* write */ gzipParams.setModificationTime(modificationTime);
        
        /* read */ Date readModificationTime = gzipParams.getModificationTime();
        
        System.out.println("Modification Time: " + readModificationTime);
    }
}