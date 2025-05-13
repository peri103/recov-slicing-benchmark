import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.tar");
        /* write */ entry.setGroupName("developers");
        /* read */ String groupName = entry.getGroupName();
        System.out.println(groupName);
    }
}