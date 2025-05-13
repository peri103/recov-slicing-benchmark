import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        
        /* write */ entry.setGroupId(1000);
        
        /* read */ long groupId = entry.getGroupId();
        
        System.out.println(groupId);
    }
}