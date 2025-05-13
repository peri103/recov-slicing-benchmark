import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setCompressionLevel(5);
        /* read */ int compressionLevel = gzipParams.getCompressionLevel();
        System.out.println(compressionLevel);
    }
}