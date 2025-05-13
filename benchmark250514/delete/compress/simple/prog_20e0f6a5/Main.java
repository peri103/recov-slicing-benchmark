import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile");
        /* write */ entry.setUnixMode(0755);
        /* read */ int mode = entry.getUnixMode();
        System.out.println("Unix Mode: " + Integer.toOctalString(mode));
    }
}