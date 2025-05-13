import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        Date lastModifiedDate = new Date(); // Initialize with current date and time
        /* write */ entry.setLastModified(lastModifiedDate);
        /* read */ Date retrievedDate = entry.getLastModified();
        System.out.println(retrievedDate);
    }
}