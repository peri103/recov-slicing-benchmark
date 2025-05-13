import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setOperatingSystem(3);
        /* read */ int osValue = gzipParams.getOperatingSystem();
        System.out.println(osValue);
    }
}