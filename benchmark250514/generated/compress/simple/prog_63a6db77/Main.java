import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testEntry");
        /* write */ entry.setSize(1024L);
        /* read */ long size = entry.getSize();
        System.out.println(size);
    }
}