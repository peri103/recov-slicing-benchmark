import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setGroupName("exampleGroup");

        // Additional operations
        ArrayList<String> groupNames = new ArrayList<>();
        groupNames.add("group1");
        groupNames.add("group2");

        DumpArchiveEntry entry2 = new DumpArchiveEntry();
        entry2.setGroupName("group3");
        groupNames.add(entry2.getGroupName());

        // Unrelated complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // More unrelated operations
        ArrayList<DumpArchiveEntry> entries = new ArrayList<>();
        entries.add(entry);
        entries.add(entry2);

        for (DumpArchiveEntry e : entries) {
            System.out.println("Entry group name: " + e.getGroupName());
        }

        // Read operation far apart from the write
        /* read */ String groupName = entry.getGroupName();
        System.out.println("Original entry group name: " + groupName);
    }
}