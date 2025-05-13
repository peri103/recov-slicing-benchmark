import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveProcessor {
    private ArchiveEntryManager manager;
    
    public ArchiveProcessor(ArchiveEntryManager manager) {
        this.manager = manager;
    }
    
    public void processEntry(String name) {
        ArArchiveEntry entry = manager.getEntry(name);
        if (entry != null) {
            System.out.println("Processing entry: " + name);
            /* read */ long crcValue = entry.getCrc();
            System.out.println("CRC Value: " + crcValue);
        } else {
            System.out.println("Entry not found: " + name);
        }
    }
}
