import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setISize(1024);
        /* read */ long value = gzipParams.getISize();
        System.out.println(value);
    }
}