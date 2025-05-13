import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = new byte[]{1, 2, 3, 4};

        /* write */ gzipParameters.setExtra(extraData);
        /* read */ byte[] readData = gzipParameters.getExtra();

        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}