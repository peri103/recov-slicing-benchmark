import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        /* write */ entry.setLinkName("exampleLink");
        /* read */ String linkName = entry.getLinkName();
        System.out.println(linkName);
    }
}