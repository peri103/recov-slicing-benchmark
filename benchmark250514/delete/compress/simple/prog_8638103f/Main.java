import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        /* write */ entry.setLinkName("linked_example.txt");
        /* read */ String linkName = entry.getLinkName();
        System.out.println(linkName);
    }
}