import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        long timeToSet = 1609459200000L; // Example timestamp (January 1, 2021)
        /* write */ zipEntry.setTime(timeToSet);
        
        /* read */ long retrievedTime = zipEntry.getTime();
        
        System.out.println("Time set in ZipArchiveEntry: " + retrievedTime);
    }
}