import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarArchiveProcessor {
    private TarArchiveManager manager = new TarArchiveManager();

    public void processEntry(String fileName) {
        TarArchiveEntry entry = new TarArchiveEntry(fileName);
        manager.addEntry(entry);
    }

    public int getEntryFileType(String fileName) {
        return manager.getFileType(fileName);
    }
}
