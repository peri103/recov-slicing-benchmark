import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setUserId(1001);
        /* read */ int userId = entry.getUserId();
        System.out.println(userId);
    }
}