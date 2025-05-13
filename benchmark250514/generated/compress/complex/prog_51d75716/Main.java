import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        ArrayList<Integer> numberList = new ArrayList<>();
        HashMap<Integer, String> numberMap = new HashMap<>();

        // Populate the list and map with some values
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 100);
            numberMap.put(i, "Number " + i);
        }

        // Perform operations on list and map
        int sum = 0;
        for (int number : numberList) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        for (int i = 0; i < numberMap.size(); i++) {
            System.out.println("Key: " + i + ", Value: " + numberMap.get(i));
        }

        // Set the size of the dump archive entry
        /* write */ entry.setSize(1024);

        // More operations on list and map
        numberList.add(500);
        numberMap.put(5, "Number 5");

        int product = 1;
        for (int number : numberList) {
            product *= (number == 0) ? 1 : number; // Avoid multiplying by zero
        }
        System.out.println("Product of numbers: " + product);

        for (int i = 0; i < numberMap.size(); i++) {
            System.out.println("Updated Key: " + i + ", Value: " + numberMap.get(i));
        }

        // Read the size of the dump archive entry
        /* read */ long size = entry.getSize();
        System.out.println("Dump Archive Entry Size: " + size);

        // Additional logic to make the program more complex
        int max = Integer.MIN_VALUE;
        for (int number : numberList) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum number in list: " + max);

        int min = Integer.MAX_VALUE;
        for (int number : numberList) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Minimum number in list: " + min);
    }
}