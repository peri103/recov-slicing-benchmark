import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("sample.txt", 1234);
        long lastModifiedTime = 1633036800000L; // Example timestamp

        /* write */ entry.setLastModified(lastModifiedTime);
        /* read */ long readLastModifiedTime = entry.getLastModified();
        
        System.out.println(readLastModifiedTime);
    }
}