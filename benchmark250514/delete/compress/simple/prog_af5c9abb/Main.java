import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile");
        /* write */ entry.setGroupId(1001);
        /* read */ long groupId = entry.getGroupId();
        System.out.println(groupId);
    }
}