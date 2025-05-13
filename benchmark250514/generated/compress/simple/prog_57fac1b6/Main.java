import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        /* write */ entry.setMethod(ZipArchiveEntry.DEFLATED);
        /* read */ int method = entry.getMethod();
        System.out.println("Method used: " + method);
    }
}