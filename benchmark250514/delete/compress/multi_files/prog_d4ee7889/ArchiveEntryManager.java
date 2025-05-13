import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveEntryManager {
    private CpioArchiveEntry entry;

    public ArchiveEntryManager(String fileName) {
        entry = new CpioArchiveEntry(fileName);
    }

    public void setLastModifiedTime(long time) {
        /* write */ entry.setLastModified(time);
    }

    public long getLastModifiedTime() {
        return entry.getLastModified();
    }
}
