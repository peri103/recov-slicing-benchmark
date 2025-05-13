import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setUncompressedSize(1024L);
        /* read */ long uncompressedSize = gzipParameters.getUncompressedSize();
        System.out.println(uncompressedSize);
    }
}