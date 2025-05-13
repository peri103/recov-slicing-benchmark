import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setOperatingSystem(3);
        /* read */ int osValue = gzipParameters.getOperatingSystem();
        System.out.println(osValue);
    }
}