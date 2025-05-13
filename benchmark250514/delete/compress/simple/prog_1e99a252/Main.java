import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setISize(12345);
        /* read */ int iSize = gzipParameters.getISize();
        System.out.println("ISize: " + iSize);
    }
}