import java.util.HashMap;

public class ArchiveManager {
    private HashMap<String, ArchiveEntry> archiveMap = new HashMap<>();

    public void addEntry(ArchiveEntry entry) {
        archiveMap.put(entry.getName(), entry);
    }

    public ArchiveEntry getEntry(String name) {
        return archiveMap.get(name);
    }

    public void printEntries() {
        for (String name : archiveMap.keySet()) {
            ArchiveEntry entry = archiveMap.get(name);
            System.out.println("File: " + name + ", Size: " + entry.getSize() + ", User ID: " + entry.getUserId());
        }
    }
}
