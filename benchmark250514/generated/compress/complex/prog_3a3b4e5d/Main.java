import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        Date modTime = new Date();
        
        ArrayList<TarArchiveEntry> archiveList = new ArrayList<>();
        HashMap<String, TarArchiveEntry> archiveMap = new HashMap<>();
        
        archiveList.add(entry);
        archiveMap.put("example.txt", entry);
        
        TarArchiveEntry newEntry = new TarArchiveEntry("new_example.txt");
        archiveList.add(newEntry);
        archiveMap.put("new_example.txt", newEntry);

        /* write */ entry.setModTime(modTime);
        
        for (TarArchiveEntry e : archiveList) {
            System.out.println("Entry name: " + e.getName());
        }
        
        TarArchiveEntry retrievedEntry = archiveMap.get("example.txt");
        
        Date currentTime = new Date();
        newEntry.setModTime(currentTime);
        
        if (retrievedEntry != null) {
            /* read */ Date retrievedModTime = retrievedEntry.getModTime();
            System.out.println("Modified time of 'example.txt': " + retrievedModTime);
        }
        
        for (TarArchiveEntry e : archiveList) {
            Date eModTime = e.getModTime();
            System.out.println("Entry: " + e.getName() + ", Modified time: " + eModTime);
        }
    }
}