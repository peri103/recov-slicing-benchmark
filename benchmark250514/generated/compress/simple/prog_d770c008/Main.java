import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.zip");
        /* write */ zipEntry.setMethod(ZipArchiveEntry.DEFLATED);
        /* read */ int method = zipEntry.getMethod();
        System.out.println("Compression method: " + method);
    }
}