import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters parameters = new GzipParameters();
        
        /* write */ parameters.setHeaderCRC(true);
        
        /* read */ boolean headerCRC = parameters.getHeaderCRC();
        
        System.out.println("Header CRC is set to: " + headerCRC);
    }
}