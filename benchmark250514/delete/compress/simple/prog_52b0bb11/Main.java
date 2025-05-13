import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt", 100);
        long lastModifiedTime = System.currentTimeMillis();
        /* write */ entry.setLastModified(lastModifiedTime);
        /* read */ long readTime = entry.getLastModified();
        System.out.println(readTime);
    }
}