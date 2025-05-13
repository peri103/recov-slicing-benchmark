import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("example.txt");
        /* write */ tarEntry.setMode(0644);
        /* read */ int mode = tarEntry.getMode();
        System.out.println(mode);
    }
}