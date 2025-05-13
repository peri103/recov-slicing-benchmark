import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        DumpArchiveEntry anotherEntry = new DumpArchiveEntry();
        
        /* write */ entry.setExternalAttributes(12345L);
        
        List<DumpArchiveEntry> entryList = new ArrayList<>();
        entryList.add(entry);
        entryList.add(anotherEntry);
        
        anotherEntry.setExternalAttributes(67890L);
        
        for (DumpArchiveEntry e : entryList) {
            System.out.println("Entry External Attributes: " + e.getExternalAttributes());
        }
        
        long attributesSum = 0;
        for (DumpArchiveEntry e : entryList) {
            attributesSum += e.getExternalAttributes();
        }
        
        System.out.println("Sum of External Attributes: " + attributesSum);
        
        /* read */ long attributes = entry.getExternalAttributes();
        System.out.println("Specific Entry External Attribute: " + attributes);
        
        for (int i = 0; i < entryList.size(); i++) {
            System.out.println("Entry " + i + " External Attributes: " + entryList.get(i).getExternalAttributes());
        }
    }
}