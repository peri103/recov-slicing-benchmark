import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class ZipEntryManager {
    private ArrayList<ZipArchiveEntry> zipEntries = new ArrayList<>();

    public void addEntry(String name) {
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        zipEntries.add(entry);
    }

    public void setEntryName(int index, String newName) {
        if (index >= 0 && index < zipEntries.size()) {
            /* write */ zipEntries.get(index).setName(newName);
        }
    }

    public String getEntryName(int index) {
        if (index >= 0 && index < zipEntries.size()) {
            return zipEntries.get(index).getName();
        }
        return null;
    }

    public ArrayList<ZipArchiveEntry> getEntries() {
        return zipEntries;
    }
}
