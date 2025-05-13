import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("dummy");
        /* write */ entry.setGroupName("myGroup");
        /* read */ String groupName = entry.getGroupName();
        System.out.println(groupName);
    }
}