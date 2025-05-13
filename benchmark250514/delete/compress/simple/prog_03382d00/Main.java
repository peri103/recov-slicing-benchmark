import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt", 100);
        /* write */ entry.setMode(755);
        /* read */ int mode = entry.getMode();
        System.out.println(mode);
    }
}