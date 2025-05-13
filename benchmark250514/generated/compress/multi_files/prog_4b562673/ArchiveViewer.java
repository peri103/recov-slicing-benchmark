import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ArchiveViewer {
    private ArchiveManager archiveManager;

    public ArchiveViewer(ArchiveManager archiveManager) {
        this.archiveManager = archiveManager;
    }

    public int displayUnixMode(String fileName) {
        ZipArchiveEntry entry = archiveManager.getEntry(fileName);
        if (entry != null) {
            /* read */ return entry.getUnixMode();
        }
        return -1;
    }
}
