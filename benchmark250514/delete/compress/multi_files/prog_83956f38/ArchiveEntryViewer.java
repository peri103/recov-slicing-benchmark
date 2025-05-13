import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveEntryViewer {
    public void printEntryDetails(ArArchiveEntry entry) {
        if (entry != null) {
            /* read */ int userId = entry.getUserId();
            System.out.println("Entry: " + entry.getName() + ", UserId: " + userId);
        } else {
            System.out.println("Entry not found.");
        }
    }
}
