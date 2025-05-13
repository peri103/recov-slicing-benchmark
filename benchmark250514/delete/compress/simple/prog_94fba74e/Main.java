import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = {1, 2, 3, 4, 5};
        
        /* write */ gzipParameters.setExtra(extraData);
        
        /* read */ byte[] retrievedData = gzipParameters.getExtra();
        
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}