import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        /* write */ gzipParameters.setHeaderCRC(true);
        
        /* read */ boolean headerCRC = gzipParameters.getHeaderCRC();
        
        System.out.println("Header CRC is set to: " + headerCRC);
    }
}