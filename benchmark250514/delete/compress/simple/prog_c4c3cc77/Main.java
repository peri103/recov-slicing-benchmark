import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setExternalAttributes(12345L);
        /* read */ long attributes = entry.getExternalAttributes();
        System.out.println(attributes);
    }
}