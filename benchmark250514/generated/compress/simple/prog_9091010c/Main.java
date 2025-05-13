import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setTime(1622505600000L); // Set time to a specific timestamp
        /* read */ long time = zipEntry.getTime();
        System.out.println(time);
    }
}