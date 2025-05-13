import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = {0x01, 0x02, 0x03};

        /* write */ gzipParameters.setExtra(extraData);
        /* read */ byte[] readExtraData = gzipParameters.getExtra();

        for (byte b : readExtraData) {
            System.out.printf("0x%02X ", b);
        }
    }
}