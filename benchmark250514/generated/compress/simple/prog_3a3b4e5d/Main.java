import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        Date modTime = new Date();
        /* write */ entry.setModTime(modTime);
        /* read */ Date retrievedModTime = entry.getModTime();
        System.out.println(retrievedModTime);
    }
}