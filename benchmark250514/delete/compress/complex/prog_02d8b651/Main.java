import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initializing a ZipArchiveEntry
        ZipArchiveEntry entry = new ZipArchiveEntry("initialName");

        // Creating a HashMap to store ZipArchiveEntries with their names
        Map<String, ZipArchiveEntry> zipEntryMap = new HashMap<>();

        // Adding the entry to the map with its initial name
        zipEntryMap.put(entry.getName(), entry);

        // Creating another ZipArchiveEntry and adding it to the map
        ZipArchiveEntry anotherEntry = new ZipArchiveEntry("anotherName");
        zipEntryMap.put(anotherEntry.getName(), anotherEntry);

        // Iterating over the map and printing the names of entries
        for (String key : zipEntryMap.keySet()) {
            System.out.println("Before change: " + key);
        }

        // Modifying the name of the original entry
        /* write */ entry.setName("newName");

        // Updating the map with the new name
        zipEntryMap.remove("initialName");
        zipEntryMap.put(entry.getName(), entry);

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More unrelated operations
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println("Alphabet: " + sb.toString());

        // Iterating over the map again and printing the updated names of entries
        for (String key : zipEntryMap.keySet()) {
            System.out.println("After change: " + key);
        }

        // Reading the name of the modified entry
        /* read */ String name = entry.getName();
        System.out.println("Final name: " + name);
    }
}