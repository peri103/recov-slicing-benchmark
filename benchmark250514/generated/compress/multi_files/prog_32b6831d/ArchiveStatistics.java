import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class ArchiveStatistics {
    private ArrayList<TarArchiveEntry> archiveList;

    public ArchiveStatistics(ArrayList<TarArchiveEntry> archiveList) {
        this.archiveList = archiveList;
    }

    public long calculateTotalSize() {
        long totalSize = 0;
        for (TarArchiveEntry entry : archiveList) {
            totalSize += entry.getSize();
        }
        return totalSize;
    }

    public long calculateAverageSize() {
        if (archiveList.isEmpty()) return 0;
        return calculateTotalSize() / archiveList.size();
    }
}
