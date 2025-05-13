import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        /* write */ entry.setUnixMode(0755);
        /* read */ int mode = entry.getUnixMode();
        System.out.println(mode);
    }
}