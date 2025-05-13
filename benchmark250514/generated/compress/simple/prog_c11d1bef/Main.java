import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("");
        /* write */ entry.setName("example.txt");
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}