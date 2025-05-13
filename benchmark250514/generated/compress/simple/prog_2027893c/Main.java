import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("testEntry");
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        /* write */ entry.setExtra(extraData);
        /* read */ byte[] readData = entry.getExtra();
        
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}