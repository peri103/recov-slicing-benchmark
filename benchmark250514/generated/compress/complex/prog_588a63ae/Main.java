import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        /* write */ entry.setExternalAttributes(0x20L);

        // Additional complexity: using a HashMap to simulate a file system
        HashMap<String, ArrayList<String>> fileSystem = new HashMap<>();
        ArrayList<String> files = new ArrayList<>();
        files.add("file1.txt");
        files.add("file2.txt");
        fileSystem.put("documents", files);

        // Simulate some operations on the file system
        for (String folder : fileSystem.keySet()) {
            System.out.println("Folder: " + folder);
            for (String file : fileSystem.get(folder)) {
                System.out.println("File: " + file);
            }
        }

        // Additional complexity: using another ZipArchiveEntry
        ZipArchiveEntry anotherEntry = new ZipArchiveEntry("another_example.txt");
        anotherEntry.setExternalAttributes(0x10L);
        long anotherAttributes = anotherEntry.getExternalAttributes();
        System.out.println("Another Entry Attributes: " + anotherAttributes);

        // Some unrelated calculations
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + result);

        // Retrieve the attributes set earlier
        /* read */ long attributes = entry.getExternalAttributes();
        System.out.println("Entry Attributes: " + attributes);

        // More unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * i);
        }
        for (int number : numbers) {
            System.out.println("Square: " + number);
        }
    }
}