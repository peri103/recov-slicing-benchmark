import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        long lastModifiedTime = System.currentTimeMillis();
        
        /* write */ entry.setLastModified(lastModifiedTime);
        /* read */ long readLastModifiedTime = entry.getLastModified();
        
        System.out.println(readLastModifiedTime);
    }
}