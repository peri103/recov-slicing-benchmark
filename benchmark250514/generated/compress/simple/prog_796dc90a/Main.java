import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        byte[] extraData = {0x01, 0x02, 0x03, 0x04};
        /* write */ zipEntry.setExtra(extraData);
        
        /* read */ byte[] retrievedData = zipEntry.getExtra();
        
        for (byte b : retrievedData) {
            System.out.printf("0x%02X ", b);
        }
    }
}