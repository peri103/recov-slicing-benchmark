import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveEntryHandler {
    private CpioArchiveEntry entry;

    public ArchiveEntryHandler() {
        entry = new CpioArchiveEntry(CpioArchiveEntry.CPIO_TRAILER, 1000);
    }

    public void setEntryName(String name) {
        /* write */ entry.setName(name);
    }

    public CpioArchiveEntry getEntry() {
        return entry;
    }
}
