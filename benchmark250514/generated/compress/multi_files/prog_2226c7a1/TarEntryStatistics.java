import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;

public class TarEntryStatistics {
    private HashMap<String, TarArchiveEntry> entryMap;

    public TarEntryStatistics(HashMap<String, TarArchiveEntry> entryMap) {
        this.entryMap = entryMap;
    }

    public int calculateAverageUserId() {
        int sumUserIds = 0;
        for (TarArchiveEntry entry : entryMap.values()) {
            sumUserIds += entry.getUserId();
        }
        return sumUserIds / entryMap.size();
    }

    public void printAllUserIds() {
        for (String key : entryMap.keySet()) {
            System.out.println("User ID of " + key + ": " + entryMap.get(key).getUserId());
        }
    }
}
