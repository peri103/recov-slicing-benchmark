import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        /* write */ entry.setMode(0644);
        /* read */ int mode = entry.getMode();
        System.out.println(mode);
    }
}