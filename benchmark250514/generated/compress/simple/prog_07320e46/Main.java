import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("dummy");
        /* write */ entry.setUserId(1001);
        /* read */ long userId = entry.getUserId();
        System.out.println(userId);
    }
}