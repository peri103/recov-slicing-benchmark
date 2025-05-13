import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters params = new GzipParameters();
        /* write */ params.setOperatingSystem(3);
        /* read */ int os = params.getOperatingSystem();
        System.out.println(os);
    }
}