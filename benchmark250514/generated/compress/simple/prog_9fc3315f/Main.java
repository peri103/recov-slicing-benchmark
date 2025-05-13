import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setTime(1633024800000L); // Set time to a specific timestamp
        /* read */ long time = zipEntry.getTime(); // Read the time set
        System.out.println("Timestamp: " + time);
    }
}