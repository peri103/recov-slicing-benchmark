import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setGroupId(1000);
        /* read */ long groupId = entry.getGroupId();
        System.out.println(groupId);
    }
}