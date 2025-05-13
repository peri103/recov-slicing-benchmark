import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        /* write */ entry.setExternalAttributes(12345);
        /* read */ long attributes = entry.getExternalAttributes();
        System.out.println(attributes);
    }
}