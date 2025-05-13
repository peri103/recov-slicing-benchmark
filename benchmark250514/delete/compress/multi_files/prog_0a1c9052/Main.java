import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArchiveEntryManager manager = new ArchiveEntryManager();
        TarArchiveEntry entry1 = new TarArchiveEntry("example1");
        manager.addEntry("entry1", entry1);

        ArchiveReader reader = new ArchiveReader(manager);

        // Set group ID for entry1
        manager.setEntryGroupId("entry1", 1001);

        // Read group ID for entry1
        long groupId = reader.getEntryGroupId("entry1");
        System.out.println("Group ID for entry1: " + groupId);

        // Additional code to make the program more complex
        TarArchiveEntry entry2 = new TarArchiveEntry("example2");
        entry2.setUserId(2002);
        manager.addEntry("entry2", entry2);

        long groupId2 = reader.getEntryGroupId("entry2");
        System.out.println("Group ID for entry2: " + groupId2);
    }
}