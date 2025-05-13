import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setUnixMode(0755);
        /* read */ int mode = entry.getUnixMode();
        System.out.println(mode);
    }
}