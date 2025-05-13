import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveAnalyzer {
    public long analyzeEntryUserId(ArArchiveEntry entry) {
        /* read */ return entry.getUserId();
    }
}
