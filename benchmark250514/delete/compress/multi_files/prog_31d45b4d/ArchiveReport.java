import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class ArchiveReport {
    public void printEntryAttributes(DumpArchiveEntry entry) {
        /* read */ long attributes = entry.getExternalAttributes();
        System.out.println("Entry external attributes: " + attributes);
    }
}
