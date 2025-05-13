import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("sample.txt");
        /* write */ entry.setGroupName("developers");
        /* read */ String groupName = entry.getGroupName();
        System.out.println(groupName);
    }
}