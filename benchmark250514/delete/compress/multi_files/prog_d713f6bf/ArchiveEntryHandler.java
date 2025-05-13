import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveEntryHandler {
    private CpioArchiveEntry entry;

    public ArchiveEntryHandler(String name) {
        this.entry = new CpioArchiveEntry(name);
    }

    public void setUserName(String userName) {
        /* write */ entry.setUserName(userName);
    }

    public CpioArchiveEntry getEntry() {
        return entry;
    }
}
