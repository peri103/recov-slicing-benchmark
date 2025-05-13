import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        /* write */ zipEntry.setTime(1625077800000L); // Set time using a sample timestamp
        
        /* read */ long time = zipEntry.getTime(); // Read the time set previously
        
        System.out.println("Time: " + time);
    }
}