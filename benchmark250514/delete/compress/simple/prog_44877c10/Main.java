import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example", 100);
        /* write */ entry.setGroupId(12345);
        /* read */ long groupId = entry.getGroupId();
        System.out.println(groupId);
    }
}