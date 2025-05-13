import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setUserName("testUser");
        /* read */ String userName = entry.getUserName();
        System.out.println(userName);
    }
}