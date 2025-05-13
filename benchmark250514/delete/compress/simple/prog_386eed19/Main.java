import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setExtra(new byte[]{1, 2, 3, 4});
        /* read */ byte[] extraData = gzipParameters.getExtra();
        
        for (byte b : extraData) {
            System.out.print(b + " ");
        }
    }
}