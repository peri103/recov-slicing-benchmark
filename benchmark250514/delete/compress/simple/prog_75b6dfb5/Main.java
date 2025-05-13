import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setExtraFlags(1);
        /* read */ int extraFlags = gzipParameters.getExtraFlags();
        System.out.println(extraFlags);
    }
}