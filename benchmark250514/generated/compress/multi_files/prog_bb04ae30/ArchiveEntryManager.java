import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveEntryManager {
    private CpioArchiveEntry entry;

    public ArchiveEntryManager(String name, long initialSize) {
        entry = new CpioArchiveEntry(name, 0);
        /* write */ entry.setSize(initialSize);
    }

    public long getEntrySize() {
        return entry.getSize();
    }
}
