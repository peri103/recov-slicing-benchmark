import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("example.txt");
        /* write */ entry.setSize(1024);
        /* read */ long size = entry.getSize();
        System.out.println(size);
    }
}