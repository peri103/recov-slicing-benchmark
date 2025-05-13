import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class LinkEntry {
    private DumpArchiveEntry entry;

    public LinkEntry() {
        entry = new DumpArchiveEntry();
    }

    public void setLink(String linkName) {
        /* write */ entry.setLinkName(linkName);
    }

    public String getLink() {
        return entry.getLinkName();
    }
}
