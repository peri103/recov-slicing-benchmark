import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setFilename("example.gz");
        /* read */ String filename = gzipParameters.getFilename();
        System.out.println(filename);
    }
}