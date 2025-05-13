import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setLinkName("exampleLink");
        /* read */ String linkName = entry.getLinkName();
        System.out.println(linkName);
    }
}