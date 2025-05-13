import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;

public class TarEntryManager {
    private TarArchiveEntry entry;

    public TarEntryManager(String fileName) {
        entry = new TarArchiveEntry(fileName);
    }

    public void setEntryModTime(Date date) {
        /* write */ entry.setModTime(date);
    }

    public TarArchiveEntry getEntry() {
        return entry;
    }
}
