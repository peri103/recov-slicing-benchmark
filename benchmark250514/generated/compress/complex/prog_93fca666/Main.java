import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a ZipArchiveEntry and set its Unix mode
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setUnixMode(0755);

        // Additional unrelated code
        ArrayList<String> fileNames = new ArrayList<>();
        fileNames.add("example.txt");
        fileNames.add("another.txt");

        HashMap<String, ZipArchiveEntry> zipEntriesMap = new HashMap<>();
        for (String fileName : fileNames) {
            ZipArchiveEntry entry = new ZipArchiveEntry(fileName);
            entry.setUnixMode(0644);
            zipEntriesMap.put(fileName, entry);
        }

        // Perform some operations on the map
        if (zipEntriesMap.containsKey("example.txt")) {
            zipEntriesMap.get("example.txt").setUnixMode(0700);
        }

        // Use a loop to iterate over the map
        for (String key : zipEntriesMap.keySet()) {
            System.out.println("File: " + key + ", Mode: " + zipEntriesMap.get(key).getUnixMode());
        }

        // Retrieve the Unix mode of the original ZipArchiveEntry
        /* read */ int unixMode = zipEntry.getUnixMode();
        System.out.println("Original entry mode: " + unixMode);

        // Further unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}