import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class DumpArchiveHandler {
    private DumpArchiveEntry entry;

    public DumpArchiveHandler() {
        entry = new DumpArchiveEntry();
    }

    public void setEntryName(String name) {
        /* write */ entry.setName(name);
    }

    public String getEntryName() {
        return entry.getName();
    }
}
