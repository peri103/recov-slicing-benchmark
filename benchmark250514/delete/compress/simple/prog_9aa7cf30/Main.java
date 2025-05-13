import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        Date currentDate = new Date();
        /* write */ gzipParameters.setModificationTime(currentDate);
        
        /* read */ Date modificationTime = gzipParameters.getModificationTime();
        System.out.println(modificationTime);
    }
}