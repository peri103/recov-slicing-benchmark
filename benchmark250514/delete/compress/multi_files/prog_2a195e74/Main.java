import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArchiveEntryManager manager = new ArchiveEntryManager();
        DumpArchiveEntry entry = new DumpArchiveEntry();

        EntryUtil.updateUserName(entry, "testUser");
        manager.addEntry(entry);

        DumpArchiveEntry anotherEntry = new DumpArchiveEntry();
        EntryUtil.updateUserName(anotherEntry, "anotherUser");
        manager.addEntry(anotherEntry);

        for (int i = 0; i < manager.getTotalEntries(); i++) {
            DumpArchiveEntry currentEntry = manager.getEntry(i);
            System.out.println("Entry UserName: " + EntryUtil.fetchUserName(currentEntry));
        }

        String userName = EntryUtil.fetchUserName(entry);
        System.out.println("Final UserName of first entry: " + userName);
    }
}