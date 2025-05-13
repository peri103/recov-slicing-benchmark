import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        /* write */ entry.setUnixMode(755);
        /* read */ int mode = entry.getUnixMode();
        System.out.println(mode);
    }
}