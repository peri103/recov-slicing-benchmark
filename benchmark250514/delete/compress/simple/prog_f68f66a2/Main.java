import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 0);
        /* write */ entry.setSize(12345);
        /* read */ long size = entry.getSize();
        System.out.println(size);
    }
}