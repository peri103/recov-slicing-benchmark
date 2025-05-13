import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setExtraFlags(1);
        /* read */ int extraFlags = gzipParams.getExtraFlags();
        System.out.println(extraFlags);
    }
}