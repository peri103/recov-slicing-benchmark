import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize TarArchiveEntry
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        // Initialize other data structures
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Populate the HashMap with some values
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Add values to the ArrayList
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }
        
        // Perform some operations on the HashMap
        if (hashMap.containsKey("two")) {
            int value = hashMap.get("two");
            System.out.println("Value for 'two': " + value);
        }
        
        // Perform some operations on the ArrayList
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList value at index " + i + ": " + arrayList.get(i));
        }
        
        // Set file type for TarArchiveEntry
        /* write */ entry.setFileType(TarArchiveEntry.REGULAR_FILE);
        
        // More complex logic
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of ArrayList values: " + sum);
        
        // Read file type from TarArchiveEntry
        /* read */ int fileType = entry.getFileType();
        System.out.println("File type of TarArchiveEntry: " + fileType);
    }
}