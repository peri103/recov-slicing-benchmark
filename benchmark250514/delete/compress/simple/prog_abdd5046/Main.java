import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        /* write */ entry.setGroupName("exampleGroup");
        /* read */ String groupName = entry.getGroupName();
        System.out.println(groupName);
    }
}