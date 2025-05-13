import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setGroupName("exampleGroup");
        /* read */ String groupName = entry.getGroupName();
        System.out.println(groupName);
    }
}