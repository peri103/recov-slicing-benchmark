import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        /* write */ entry.setCompressedSize(500);
        /* read */ long compressedSize = entry.getCompressedSize();
        System.out.println(compressedSize);
    }
}