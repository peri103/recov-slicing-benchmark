import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        long lastModifiedTime = 1625097600000L; // Example timestamp
        /* write */ entry.setLastModified(lastModifiedTime);
        /* read */ long readLastModifiedTime = entry.getLastModified();
        System.out.println(readLastModifiedTime);
    }
}