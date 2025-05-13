import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class DumpArchiveEntryWrapper {
    private DumpArchiveEntry entry = new DumpArchiveEntry();

    public void setLinkName(String linkName) {
        /* write */ entry.setLinkName(linkName);
    }

    public String getLinkName() {
        return entry.getLinkName();
    }
}
