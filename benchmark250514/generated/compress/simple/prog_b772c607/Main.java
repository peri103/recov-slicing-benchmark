import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("testEntry");
        /* write */ entry.setGroupName("testGroup");
        /* read */ String groupName = entry.getGroupName();
        System.out.println(groupName);
    }
}