import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class DumpArchiveEntryWrapper {
    private DumpArchiveEntry entry = new DumpArchiveEntry();

    public void setCrcValue(long crc) {
        /* write */ entry.setCrc(crc);
    }

    public long getCrcValue() {
        return entry.getCrc();
    }
}
