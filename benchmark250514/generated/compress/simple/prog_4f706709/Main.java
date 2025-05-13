import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt");
        /* write */ entry.setName("newfile.txt");
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}