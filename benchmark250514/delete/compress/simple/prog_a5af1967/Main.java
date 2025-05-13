import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt", 100);
        /* write */ entry.setUserId(12345);
        /* read */ long userId = entry.getUserId();
        System.out.println(userId);
    }
}