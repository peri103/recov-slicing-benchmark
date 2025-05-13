import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setCompressedSize(1024);
        /* read */ long compressedSize = zipEntry.getCompressedSize();
        System.out.println(compressedSize);
    }
}