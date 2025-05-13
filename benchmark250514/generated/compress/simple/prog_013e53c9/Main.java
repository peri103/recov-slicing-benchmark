import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters parameters = new GzipParameters();
        /* write */ parameters.setOperatingSystem(3);
        /* read */ int os = parameters.getOperatingSystem();
        System.out.println(os);
    }
}