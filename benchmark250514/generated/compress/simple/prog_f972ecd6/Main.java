import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setMode(777);
        /* read */ int mode = entry.getMode();
        System.out.println(mode);
    }
}