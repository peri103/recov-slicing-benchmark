import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        Date now = new Date();
        /* write */ entry.setModTime(now);
        /* read */ Date modTime = entry.getModTime();
        System.out.println(modTime);
    }
}