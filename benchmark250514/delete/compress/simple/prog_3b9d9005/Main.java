import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        /* write */ entry.setLastModified(123456789L);
        /* read */ long lastModified = entry.getLastModified();
        System.out.println(lastModified);
    }
}