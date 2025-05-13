import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        long lastModifiedTime = System.currentTimeMillis();
        /* write */ entry.setLastModified(lastModifiedTime);
        /* read */ long retrievedLastModifiedTime = entry.getLastModified();
        System.out.println(retrievedLastModifiedTime);
    }
}