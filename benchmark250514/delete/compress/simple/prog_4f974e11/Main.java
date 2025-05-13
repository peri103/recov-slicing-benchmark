import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        Date modificationDate = new Date();

        /* write */ gzipParameters.setModificationTime(modificationDate);
        /* read */ Date readDate = gzipParameters.getModificationTime();

        System.out.println(readDate);
    }
}