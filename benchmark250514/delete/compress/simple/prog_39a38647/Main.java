import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setUncompressedSize(12345L);
        /* read */ long uncompressedSize = gzipParams.getUncompressedSize();
        System.out.println(uncompressedSize);
    }
}