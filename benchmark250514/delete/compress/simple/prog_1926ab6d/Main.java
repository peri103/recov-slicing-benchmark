import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("initialName");
        /* write */ zipEntry.setName("newName");
        /* read */ String name = zipEntry.getName();
        System.out.println(name);
    }
}