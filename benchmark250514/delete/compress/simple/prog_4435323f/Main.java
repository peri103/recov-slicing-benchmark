import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile", 1000);
        /* write */ entry.setMode(644);
        /* read */ int mode = entry.getMode();
        System.out.println("Mode: " + mode);
    }
}