import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        /* write */ entry.setCompressedSize(1024L);
        /* read */ long compressedSize = entry.getCompressedSize();
        System.out.println(compressedSize);
    }
}