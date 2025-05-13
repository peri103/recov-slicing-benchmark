import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");

        // Create a list to store multiple ZipArchiveEntries
        List<ZipArchiveEntry> entries = new ArrayList<>();
        entries.add(entry);

        // Add another ZipArchiveEntry with a different comment
        ZipArchiveEntry entry2 = new ZipArchiveEntry("another_example.txt");
        entry2.setComment("Another comment");
        entries.add(entry2);

        // Perform some operations on the list
        for (ZipArchiveEntry e : entries) {
            if (e.getName().equals("example.txt")) {
                /* write */ e.setComment("This is a comment.");
            }
        }

        // More complex operations
        int count = 0;
        for (ZipArchiveEntry e : entries) {
            if (e.getComment() != null && !e.getComment().isEmpty()) {
                count++;
            }
        }
        System.out.println("Number of entries with comments: " + count);

        // Simulate some unrelated logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        // Retrieve the comment from the original entry
        /* read */ String comment = entry.getComment();
        System.out.println("Comment on 'example.txt': " + comment);
    }
}