import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveEntryHandler {
    private CpioArchiveEntry entry;

    public ArchiveEntryHandler(String initialName) {
        entry = new CpioArchiveEntry(initialName);
    }

    public void updateEntryName(String newName) {
        /* write */ entry.setName(newName);
    }

    public String getEntryName() {
        return entry.getName();
    }
}
