import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArchiveEntryManager manager = new ArchiveEntryManager();
        manager.addEntry("example.txt", 1024);
        manager.addEntry("example2.txt", 2048);
        manager.addEntry("example3.txt", 4096);

        ArchiveStatistics stats = new ArchiveStatistics(manager.getArchiveList());

        System.out.println("Total Size: " + stats.calculateTotalSize());
        System.out.println("Average Size: " + stats.calculateAverageSize());

        TarArchiveEntry firstEntry = manager.getArchiveList().get(0);
        /* read */ long size = firstEntry.getSize();
        System.out.println("Size of the first entry: " + size);
    }
}