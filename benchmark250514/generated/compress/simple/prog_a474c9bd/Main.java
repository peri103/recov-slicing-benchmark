import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setUnixMode(644);
        /* read */ int unixMode = zipEntry.getUnixMode();
        System.out.println("Unix Mode: " + unixMode);
    }
}