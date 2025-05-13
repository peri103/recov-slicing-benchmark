import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt", 100);
        /* write */ entry.setExternalAttributes(12345L);
        /* read */ long attributes = entry.getExternalAttributes();
        System.out.println(attributes);
    }
}