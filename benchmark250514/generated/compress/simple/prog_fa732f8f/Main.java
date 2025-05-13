import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setCompressionLevel(5);
        /* read */ int compressionLevel = gzipParameters.getCompressionLevel();
        System.out.println(compressionLevel);
    }
}