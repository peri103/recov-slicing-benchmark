import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.zip");
        
        /* write */ zipEntry.setTime(System.currentTimeMillis());
        
        /* read */ long time = zipEntry.getTime();
        System.out.println("Time set in ZipArchiveEntry: " + time);
    }
}