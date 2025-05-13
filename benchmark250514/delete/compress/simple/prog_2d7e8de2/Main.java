import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        long lastModifiedTime = 1625164800000L; // Example timestamp
        /* write */ entry.setLastModified(lastModifiedTime);
        /* read */ long retrievedTime = entry.getLastModified();
        System.out.println(retrievedTime);
    }
}