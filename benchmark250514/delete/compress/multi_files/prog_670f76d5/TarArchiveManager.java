import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class TarArchiveManager {
    private ArrayList<TarArchiveEntry> entryList = new ArrayList<>();
    private HashMap<String, Integer> typeMap = new HashMap<>();

    public void addEntry(TarArchiveEntry entry) {
        entryList.add(entry);
        /* write */ entry.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);
        typeMap.put(entry.getName(), entry.getFileType());
    }

    public int getFileType(String entryName) {
        return typeMap.getOrDefault(entryName, -1);
    }

    public ArrayList<TarArchiveEntry> getEntryList() {
        return entryList;
    }

    public HashMap<String, Integer> getTypeMap() {
        return typeMap;
    }
}
