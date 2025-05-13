import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setUnixMode(0755);
        /* read */ int unixMode = zipEntry.getUnixMode();
        System.out.println(unixMode);
    }
}