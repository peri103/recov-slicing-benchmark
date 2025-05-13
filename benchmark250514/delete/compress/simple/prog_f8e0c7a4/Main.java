import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setCRC32(123456789);
        /* read */ long crcValue = gzipParams.getCRC32();
        System.out.println(crcValue);
    }
}