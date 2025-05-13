import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setCRC32(123456);
        /* read */ long crc32Value = gzipParameters.getCRC32();
        System.out.println(crc32Value);
    }
}