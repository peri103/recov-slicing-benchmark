import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setOperatingSystem(3);
        /* read */ int operatingSystem = gzipParameters.getOperatingSystem();
        System.out.println("Operating System: " + operatingSystem);
    }
}