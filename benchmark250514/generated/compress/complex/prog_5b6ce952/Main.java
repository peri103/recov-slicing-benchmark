import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("sample.txt");
        HashMap<String, TarArchiveEntry> archiveMap = new HashMap<>();
        
        // Adding entries to the map
        archiveMap.put("entry1", new TarArchiveEntry("file1.txt"));
        archiveMap.put("entry2", new TarArchiveEntry("file2.txt"));
        
        // Setting groupId for each entry
        archiveMap.get("entry1").setGroupId(2001);
        archiveMap.get("entry2").setGroupId(3001);
        
        /* write */ entry.setGroupId(1001);
        
        // Performing some unrelated operations
        int sumOfGroupIds = 0;
        for (String key : archiveMap.keySet()) {
            sumOfGroupIds += archiveMap.get(key).getGroupId();
        }
        
        System.out.println("Sum of Group IDs: " + sumOfGroupIds);
        
        // More operations
        int averageGroupId = sumOfGroupIds / archiveMap.size();
        System.out.println("Average Group ID: " + averageGroupId);
        
        // Perform some calculations
        int result = averageGroupId * 2 + 100;
        System.out.println("Calculated Result: " + result);
        
        /* read */ long groupId = entry.getGroupId();
        System.out.println(groupId);
        
        // Final operations
        archiveMap.put("entry3", entry);
        for (String key : archiveMap.keySet()) {
            System.out.println("Entry: " + key + ", Group ID: " + archiveMap.get(key).getGroupId());
        }
    }
}