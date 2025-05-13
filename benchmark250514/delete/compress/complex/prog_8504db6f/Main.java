import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1234);
        /* write */ entry.setLinkName("linkNameExample");

        // Additional code to make the program more complex
        ArrayList<ArArchiveEntry> entryList = new ArrayList<>();
        entryList.add(entry);
        
        ArArchiveEntry anotherEntry = new ArArchiveEntry("anotherExample.txt", 5678);
        anotherEntry.setLinkName("anotherLinkNameExample");
        entryList.add(anotherEntry);

        for (ArArchiveEntry e : entryList) {
            System.out.println("Entry Name: " + e.getName() + ", Size: " + e.getSize());
        }

        ArArchiveEntry selectedEntry = entryList.get(0);
        String selectedEntryLinkName = selectedEntry.getLinkName();

        // More unrelated operations
        int totalSize = 0;
        for (ArArchiveEntry e : entryList) {
            totalSize += e.getSize();
        }
        System.out.println("Total Size: " + totalSize);

        // Final read operation, far apart from the write
        /* read */ String linkName = entry.getLinkName();
        System.out.println(linkName);
    }
}