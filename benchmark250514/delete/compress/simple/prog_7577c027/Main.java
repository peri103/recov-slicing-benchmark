import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setFlags(5);
        /* read */ int flags = gzipParams.getFlags();
        System.out.println(flags);
    }
}