import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("initialName");
        /* write */ entry.setName("newName");
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}