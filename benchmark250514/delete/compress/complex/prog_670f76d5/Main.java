import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        // Create a complex data structure
        HashMap<String, ArrayList<TarArchiveEntry>> archiveMap = new HashMap<>();
        ArrayList<TarArchiveEntry> entryList = new ArrayList<>();
        
        // Add entries to the list
        entryList.add(new TarArchiveEntry("file1.txt"));
        entryList.add(new TarArchiveEntry("file2.txt"));
        
        // Add the list to the map
        archiveMap.put("files", entryList);
        
        // Perform operations on the map
        for (String key : archiveMap.keySet()) {
            ArrayList<TarArchiveEntry> list = archiveMap.get(key);
            for (TarArchiveEntry e : list) {
                e.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);
            }
        }
        
        /* write */ entry.setFileType(TarArchiveEntry.FILE_TYPE_NORMAL);
        
        // Perform operations on the list
        for (TarArchiveEntry e : entryList) {
            System.out.println("File: " + e.getName() + ", Type: " + e.getFileType());
        }
        
        // Additional unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        
        /* read */ int fileType = entry.getFileType();
        System.out.println("File type of 'example.txt': " + fileType);
        
        // More complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}