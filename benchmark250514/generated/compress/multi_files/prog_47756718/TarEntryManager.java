import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;

public class TarEntryManager {
    private TarArchiveEntry entry;

    public TarEntryManager(String fileName) {
        entry = new TarArchiveEntry(fileName);
    }

    public void setModificationTime(Date modTime) {
        /* write */ entry.setModTime(modTime);
    }

    public Date getModificationTime() {
        return entry.getModTime();
    }
}
