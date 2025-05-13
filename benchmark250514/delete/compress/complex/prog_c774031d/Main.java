import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");

        // Initialize an ArrayList to store different TarArchiveEntry objects
        List<TarArchiveEntry> entryList = new ArrayList<>();

        // Add multiple entries to the list
        for (int i = 0; i < 5; i++) {
            TarArchiveEntry tempEntry = new TarArchiveEntry("file" + i + ".txt");
            tempEntry.setFileType(TarArchiveEntry.FILE_TYPE_REGULAR);
            entryList.add(tempEntry);
        }

        // Modify the original entry's file type
        /* write */ entry.setFileType(TarArchiveEntry.FILE_TYPE_REGULAR);

        // Perform some operations on the list
        for (TarArchiveEntry e : entryList) {
            System.out.println("Entry name: " + e.getName() + ", File type: " + e.getFileType());
        }

        // Add the original entry to the list
        entryList.add(entry);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Retrieve and print the file type of the original entry
        /* read */ int fileType = entry.getFileType();
        System.out.println("Original entry file type: " + fileType);

        // Further operations on the list
        for (TarArchiveEntry e : entryList) {
            if (e.getFileType() == TarArchiveEntry.FILE_TYPE_REGULAR) {
                System.out.println(e.getName() + " is a regular file.");
            }
        }
    }
}