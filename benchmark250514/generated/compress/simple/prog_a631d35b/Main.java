import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setUserId(1001);
        /* read */ int userId = entry.getUserId();
        System.out.println(userId);
    }
}