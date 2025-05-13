import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveManager {
    private CpioArchiveEntry entry;

    public ArchiveManager() {
        this.entry = new CpioArchiveEntry();
    }

    public void setArchiveSize(long size) {
        /* write */ entry.setSize(size);
    }

    public long getArchiveSize() {
        return entry.getSize();
    }
}
