import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class EntryUtil {
    public static void updateUserName(DumpArchiveEntry entry, String newUserName) {
        /* write */ entry.setUserName(newUserName);
    }

    public static String fetchUserName(DumpArchiveEntry entry) {
        /* read */ return entry.getUserName();
    }
}
