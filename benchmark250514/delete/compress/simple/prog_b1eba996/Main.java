import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setFlags(123);
        /* read */ int flags = gzipParameters.getFlags();
        System.out.println(flags);
    }
}