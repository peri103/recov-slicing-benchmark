import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        /* write */ entry.setLinkName("link.txt");
        /* read */ String linkName = entry.getLinkName();
        System.out.println(linkName);
    }
}