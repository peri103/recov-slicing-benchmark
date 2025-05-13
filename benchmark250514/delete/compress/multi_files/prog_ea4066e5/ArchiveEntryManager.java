import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveEntryManager {
    private CpioArchiveEntry entry;

    public ArchiveEntryManager(String fileName) {
        entry = new CpioArchiveEntry(fileName);
    }

    public void setEntryCrc(long crc) {
        /* write */ entry.setCrc(crc);
    }

    public long getEntryCrc() {
        return entry.getCrc();
    }
}
