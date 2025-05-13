import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setCompressedSize(1024);
        /* read */ long compressedSize = gzipParams.getCompressedSize();
        System.out.println(compressedSize);
    }
}