import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("example.txt");
        /* write */ tarEntry.setGroupId(1001);
        /* read */ long groupId = tarEntry.getGroupId();
        System.out.println(groupId);
    }
}