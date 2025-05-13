import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testEntry");
        long lastModifiedTime = System.currentTimeMillis();
        /* write */ entry.setLastModified(lastModifiedTime);
        /* read */ long readLastModifiedTime = entry.getLastModified();
        System.out.println(readLastModifiedTime);
    }
}