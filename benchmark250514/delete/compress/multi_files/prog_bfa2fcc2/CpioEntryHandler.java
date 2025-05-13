import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class CpioEntryHandler {
    private CpioArchiveEntry entry;

    public CpioEntryHandler(String fileName) {
        this.entry = new CpioArchiveEntry(fileName);
    }

    public void setMode(int mode) {
        /* write */ entry.setUnixMode(mode);
    }

    public int getMode() {
        return entry.getUnixMode();
    }
}
