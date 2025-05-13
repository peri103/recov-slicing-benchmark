import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setCompressedSize(12345L);
        /* read */ long compressedSize = gzipParameters.getCompressedSize();
        System.out.println(compressedSize);
    }
}