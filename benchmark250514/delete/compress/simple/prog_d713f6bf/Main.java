import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        /* write */ entry.setUserName("JohnDoe");
        /* read */ String userName = entry.getUserName();
        System.out.println(userName);
    }
}