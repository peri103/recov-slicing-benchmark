import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        /* write */ entry.setExternalAttributes(12345L);
        /* read */ long value = entry.getExternalAttributes();
        System.out.println(value);
    }
}