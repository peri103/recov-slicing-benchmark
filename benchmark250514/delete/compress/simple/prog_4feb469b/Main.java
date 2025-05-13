import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        /* write */ entry.setGroupId(12345L);
        /* read */ long groupId = entry.getGroupId();
        System.out.println(groupId);
    }
}