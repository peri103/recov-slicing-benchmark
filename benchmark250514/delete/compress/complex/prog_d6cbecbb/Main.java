import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        /* write */ entry.setExtra(extraData);
        
        // Adding complexity with additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Performing some operations with the entry object before reading
        int entrySize = entry.getLength();
        String entryName = entry.getName();
        System.out.println("Entry Name: " + entryName + ", Size: " + entrySize);

        // More unrelated operations
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        for (String str : strings) {
            System.out.println(str);
        }

        /* read */ byte[] readData = entry.getExtra();
        
        System.out.print("Extra Data: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
    }
}