import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("test.zip");
        long currentTime = System.currentTimeMillis();
        
        /* write */ zipEntry.setTime(currentTime);
        /* read */ long readTime = zipEntry.getTime();
        
        System.out.println("Time set: " + currentTime);
        System.out.println("Time read: " + readTime);
    }
}