import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setSize(1024);
        /* read */ long size = entry.getSize();
        System.out.println(size);
    }
}