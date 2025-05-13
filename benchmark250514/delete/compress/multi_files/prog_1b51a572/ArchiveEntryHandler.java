import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveEntryHandler {
    private CpioArchiveEntry entry;

    public ArchiveEntryHandler(String initialName) {
        entry = new CpioArchiveEntry(CpioArchiveEntry.FORMAT_NEW, 0);
        /* write */ entry.setName(initialName);
    }

    public CpioArchiveEntry getEntry() {
        return entry;
    }
}
