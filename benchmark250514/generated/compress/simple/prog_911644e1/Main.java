import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        /* write */ entry.setUserId(1001);
        /* read */ int userId = entry.getUserId();
        System.out.println(userId);
    }
}