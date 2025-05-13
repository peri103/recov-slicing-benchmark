import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setISize(12345);
        /* read */ int iSize = gzipParams.getISize();
        System.out.println(iSize);
    }
}