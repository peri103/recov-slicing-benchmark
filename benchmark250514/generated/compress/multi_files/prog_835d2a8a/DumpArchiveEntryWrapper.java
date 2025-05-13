import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class DumpArchiveEntryWrapper {
    private DumpArchiveEntry entry;

    public DumpArchiveEntryWrapper() {
        entry = new DumpArchiveEntry();
    }

    public void setEntryMode(int mode) {
        /* write */ entry.setMode(mode);
    }

    public int getEntryMode() {
        return entry.getMode();
    }
}
