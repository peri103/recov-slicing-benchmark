import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        long currentTimeMillis = System.currentTimeMillis();
        /* write */ entry.setLastModified(currentTimeMillis);
        /* read */ long lastModified = entry.getLastModified();
        System.out.println(lastModified);
    }
}