import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class CpioHandler {
    private CpioArchiveEntry entry;

    public CpioHandler(String name) {
        entry = new CpioArchiveEntry(name);
    }

    public void setEntryMode(int mode) {
        entry.setMode(mode);
    }

    public int getEntryMode() {
        /* read */ return entry.getMode();
    }
}
