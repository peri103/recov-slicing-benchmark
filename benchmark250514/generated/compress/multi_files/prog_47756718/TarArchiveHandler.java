import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;

public class TarArchiveHandler {
    private TarArchiveEntry entry;

    public TarArchiveHandler(String fileName) {
        entry = new TarArchiveEntry(fileName);
    }

    public void setModificationTime(Date modTime) {
        /* write */ entry.setModTime(modTime);
    }

    public TarArchiveEntry getEntry() {
        return entry;
    }
}
