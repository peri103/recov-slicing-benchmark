import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("example");
        /* write */ entry.setCrc(123456789L);
        /* read */ long crcValue = entry.getCrc();
        System.out.println(crcValue);
    }
}