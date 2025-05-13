import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile");
        /* write */ entry.setCrc(12345L);
        /* read */ long crcValue = entry.getCrc();
        System.out.println(crcValue);
    }
}