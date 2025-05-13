import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioArchiveEntry.FORMAT_NEW, 0);
        /* write */ entry.setName("exampleName");
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}