import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setCrc(12345L);
        /* read */ long crcValue = entry.getCrc();
        System.out.println(crcValue);
    }
}