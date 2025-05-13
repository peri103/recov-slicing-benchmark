import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        ArrayList<TarArchiveEntry> entries = new ArrayList<>();
        HashMap<String, Integer> fileTypeMap = new HashMap<>();

        // Adding some dummy entries to the list
        entries.add(new TarArchiveEntry("file1.txt"));
        entries.add(new TarArchiveEntry("file2.txt"));
        
        // Setting the file type for the main entry
        /* write */ entry.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);

        // Adding the main entry to the list
        entries.add(entry);

        // Process each entry
        for (TarArchiveEntry e : entries) {
            int type = e.getFileType();
            fileTypeMap.put(e.getName(), type);
        }

        // Doing some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Retrieve and print the file type of the main entry
        /* read */ int fileType = entry.getFileType();
        System.out.println("File Type of 'example.txt': " + fileType);

        // Print all file types from the map
        for (String fileName : fileTypeMap.keySet()) {
            System.out.println("File: " + fileName + ", Type: " + fileTypeMap.get(fileName));
        }
    }
}