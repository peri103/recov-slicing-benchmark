import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        /* write */ entry.setExternalAttributes(12345);
        /* read */ long attributes = entry.getExternalAttributes();
        System.out.println(attributes);
    }
}