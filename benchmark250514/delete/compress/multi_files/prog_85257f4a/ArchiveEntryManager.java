import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveEntryManager {
    private CpioArchiveEntry entry;

    public ArchiveEntryManager(String name) {
        entry = new CpioArchiveEntry(name);
    }

    public void setEntryMode(int mode) {
        /* write */ entry.setMode(mode);
    }

    public int getEntryMode() {
        return entry.getMode();
    }
}