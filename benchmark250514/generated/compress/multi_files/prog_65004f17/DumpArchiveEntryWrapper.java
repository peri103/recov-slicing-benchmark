import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class DumpArchiveEntryWrapper {
    private DumpArchiveEntry entry;

    public DumpArchiveEntryWrapper() {
        this.entry = new DumpArchiveEntry();
    }

    public void setEntryName(String name) {
        /* write */ entry.setName(name);
    }

    public String getEntryName() {
        return entry.getName();
    }
}
