import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1234);
        /* write */ entry.setLinkName("linkNameExample");
        /* read */ String linkName = entry.getLinkName();
        System.out.println(linkName);
    }
}