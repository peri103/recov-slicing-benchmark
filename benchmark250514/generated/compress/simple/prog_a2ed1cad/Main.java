import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        // Initialize extra data
        byte[] extraData = {0x01, 0x02, 0x03, 0x04};
        
        /* write */ zipEntry.setExtra(extraData);
        
        /* read */ byte[] readData = zipEntry.getExtra();
        
        // Print the read data
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}