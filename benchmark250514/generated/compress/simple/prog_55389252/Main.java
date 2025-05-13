import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("dummy");
        /* write */ entry.setUserName("testuser");
        /* read */ String username = entry.getUserName();
        System.out.println(username);
    }
}