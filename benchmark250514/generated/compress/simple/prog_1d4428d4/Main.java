import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("initialName");
        /* write */ entry.setName("newName");
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}