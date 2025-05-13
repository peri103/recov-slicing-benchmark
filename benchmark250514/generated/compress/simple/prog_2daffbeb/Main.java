import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("example");
        /* write */ tarEntry.setGroupName("myGroup");
        /* read */ String groupName = tarEntry.getGroupName();
        System.out.println(groupName);
    }
}