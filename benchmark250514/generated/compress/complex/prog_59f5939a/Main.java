import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("sample.txt");
        TarArchiveEntry entry2 = new TarArchiveEntry("example.txt");
        ArrayList<TarArchiveEntry> entryList = new ArrayList<>();
        HashMap<String, TarArchiveEntry> entryMap = new HashMap<>();

        /* write */ entry.setGroupName("developers");
        entry2.setGroupName("admins");

        entryList.add(entry);
        entryList.add(entry2);

        entryMap.put("file1", entry);
        entryMap.put("file2", entry2);

        for (TarArchiveEntry e : entryList) {
            System.out.println("Entry: " + e.getName() + ", Group: " + e.getGroupName());
        }

        TarArchiveEntry retrievedEntry = entryMap.get("file1");
        System.out.println("Retrieved Entry: " + retrievedEntry.getName());

        // Simulating some operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }

        // More unrelated operations
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("World!");

        /* read */ String groupName = entry.getGroupName();
        System.out.println("Main Entry Group Name: " + groupName);

        // Final operations
        System.out.println("Sum: " + sum);
        System.out.println("Message: " + sb.toString());
    }
}