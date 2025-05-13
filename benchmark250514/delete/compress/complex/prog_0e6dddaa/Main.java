import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.apache.commons.compress.archivers.dump.DumpArchiveSummary;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        ArrayList<DumpArchiveEntry> entryList = new ArrayList<>();
        HashMap<String, DumpArchiveSummary> summaryMap = new HashMap<>();
        
        DumpArchiveSummary summary1 = new DumpArchiveSummary();
        summary1.setName("Summary1");
        summaryMap.put("Summary1", summary1);

        DumpArchiveSummary summary2 = new DumpArchiveSummary();
        summary2.setName("Summary2");
        summaryMap.put("Summary2", summary2);

        /* write */ entry.setGroupId(12345);
        entryList.add(entry);

        // Additional operations on entryList and summaryMap
        for (DumpArchiveEntry e : entryList) {
            System.out.println("Processing entry with group ID: " + e.getGroupId());
        }

        for (String key : summaryMap.keySet()) {
            System.out.println("Summary Name: " + summaryMap.get(key).getName());
        }

        // Manipulate entryList further
        DumpArchiveEntry anotherEntry = new DumpArchiveEntry();
        anotherEntry.setGroupId(54321);
        entryList.add(anotherEntry);

        for (DumpArchiveEntry e : entryList) {
            System.out.println("Entry Group ID: " + e.getGroupId());
        }

        // Finally read the groupId from the original entry
        /* read */ int groupId = entry.getGroupId();
        System.out.println("Original entry group ID: " + groupId);
    }
}