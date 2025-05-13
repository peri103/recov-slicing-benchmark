import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        /* write */ entry.setCompressedSize(1024);
        /* read */ long compressedSize = entry.getCompressedSize();
        System.out.println(compressedSize);
    }
}