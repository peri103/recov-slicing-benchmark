import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setUnixMode(755);
        /* read */ int unixMode = entry.getUnixMode();
        System.out.println(unixMode);
    }
}