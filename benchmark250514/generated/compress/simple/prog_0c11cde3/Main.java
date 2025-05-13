import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("sample.txt");
        /* write */ tarEntry.setLinkName("linked_sample.txt");
        /* read */ String linkName = tarEntry.getLinkName();
        System.out.println(linkName);
    }
}