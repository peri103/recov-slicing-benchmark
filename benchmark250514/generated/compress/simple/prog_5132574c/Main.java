import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        byte[] extraData = {1, 2, 3, 4, 5};
        /* write */ zipEntry.setExtra(extraData);
        
        /* read */ byte[] readExtraData = zipEntry.getExtra();
        
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}