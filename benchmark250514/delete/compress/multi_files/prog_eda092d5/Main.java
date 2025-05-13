import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArchiveManager manager = new ArchiveManager();
        ArchiveEntryHandler handler = new ArchiveEntryHandler("example.txt", 1000);

        handler.handleEntry(manager);

        // Additional operations
        ArArchiveEntry anotherEntry = new ArArchiveEntry("another.txt", 2000);
        anotherEntry.setLastModified(System.currentTimeMillis() - 10000);
        manager.addEntry(anotherEntry);

        for (ArArchiveEntry archiveEntry : manager.getArchiveList()) {
            System.out.println("Archive Entry: " + archiveEntry.getName() + ", Size: " + archiveEntry.getSize());
        }

        long totalSize = 0;
        for (ArArchiveEntry archiveEntry : manager.getArchiveList()) {
            totalSize += archiveEntry.getSize();
        }
        System.out.println("Total Size of Archives: " + totalSize);

        if (totalSize > 1500) {
            System.out.println("Total size exceeds 1500.");
        } else {
            System.out.println("Total size is within limit.");
        }

        long lastModified = handler.getEntryLastModified();
        System.out.println("Last Modified Time of 'example.txt': " + lastModified);
    }
}