import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setMode(0644);
        /* read */ int mode = entry.getMode();
        System.out.println("Mode: " + mode);
    }
}