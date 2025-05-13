import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        long currentTime = System.currentTimeMillis();
        
        /* write */ entry.setLastModified(currentTime);
        /* read */ long lastModified = entry.getLastModified();
        
        System.out.println("Last Modified Time: " + lastModified);
    }
}