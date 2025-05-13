import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setGroupId(1001);
        /* read */ long groupId = entry.getGroupId();
        System.out.println(groupId);
    }
}