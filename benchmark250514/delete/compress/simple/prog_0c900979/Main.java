import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};

        /* write */ gzipParams.setExtra(extraData);
        /* read */ byte[] readExtraData = gzipParams.getExtra();
        
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}