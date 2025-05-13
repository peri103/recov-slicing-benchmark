import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry and set its file type
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setFileType(TarArchiveEntry.LF_NORMAL);

        // Create a HashMap to store file types with their descriptions
        HashMap<Integer, String> fileTypeDescriptions = new HashMap<>();
        fileTypeDescriptions.put(TarArchiveEntry.LF_NORMAL, "Normal File");
        fileTypeDescriptions.put(TarArchiveEntry.LF_DIRECTORY, "Directory");
        fileTypeDescriptions.put(TarArchiveEntry.LF_SYMLINK, "Symbolic Link");

        // Create an ArrayList to store multiple TarArchiveEntries
        ArrayList<TarArchiveEntry> entries = new ArrayList<>();
        entries.add(entry);
        entries.add(new TarArchiveEntry("directory/"));
        entries.get(1).setFileType(TarArchiveEntry.LF_DIRECTORY);

        // Process entries in the list
        for (TarArchiveEntry e : entries) {
            int type = e.getFileType();
            String description = fileTypeDescriptions.get(type);
            System.out.println("Entry: " + e.getName() + ", Type: " + description);
        }

        // Retrieve and print the file type of the original entry
        /* read */ int fileType = entry.getFileType();
        String fileTypeDescription = fileTypeDescriptions.get(fileType);
        System.out.println("Original Entry File Type: " + fileTypeDescription);

        // Additional complexity: Calculate total size of entries
        long totalSize = 0;
        for (TarArchiveEntry e : entries) {
            totalSize += e.getSize();
        }
        System.out.println("Total Size of Entries: " + totalSize);

        // Additional complexity: Check if all entries are directories
        boolean allDirectories = true;
        for (TarArchiveEntry e : entries) {
            if (e.getFileType() != TarArchiveEntry.LF_DIRECTORY) {
                allDirectories = false;
                break;
            }
        }
        System.out.println("Are all entries directories? " + allDirectories);
    }
}