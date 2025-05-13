import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setSize(1024);
        /* read */ long size = zipEntry.getSize();
        System.out.println(size);
    }
}