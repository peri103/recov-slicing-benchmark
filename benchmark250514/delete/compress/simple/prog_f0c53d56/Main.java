import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        /* write */ entry.setExternalAttributes(12345);
        /* read */ int externalAttributes = entry.getExternalAttributes();
        System.out.println(externalAttributes);
    }
}