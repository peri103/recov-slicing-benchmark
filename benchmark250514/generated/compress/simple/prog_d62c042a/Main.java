import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("initial");
        /* write */ entry.setName("newName");
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}