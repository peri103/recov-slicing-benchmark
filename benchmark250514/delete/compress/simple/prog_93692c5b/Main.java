import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        // Initialize the extra field with some byte array value
        byte[] extraData = {1, 2, 3, 4, 5};

        /* write */ gzipParameters.setExtra(extraData);

        /* read */ byte[] readExtraData = gzipParameters.getExtra();
        
        // Print the read values to verify
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}