import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        long lastModifiedTime = 1625097600000L; // Example timestamp
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> stringToIndexMap = new HashMap<>();
        
        // Adding elements to the list and map
        for (int i = 0; i < 5; i++) {
            stringList.add("String" + i);
            stringToIndexMap.put("String" + i, i);
        }
        
        // Using the map to get index and print corresponding string
        for (String key : stringToIndexMap.keySet()) {
            int index = stringToIndexMap.get(key);
            System.out.println("Index of " + key + ": " + index);
            System.out.println("String at index " + index + ": " + stringList.get(index));
        }
        
        /* write */ entry.setLastModified(lastModifiedTime);
        
        // More complex operations
        List<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            doubleList.add(Math.random() * 100);
        }
        
        double sum = 0;
        for (Double d : doubleList) {
            sum += d;
        }
        double average = sum / doubleList.size();
        System.out.println("Average of random doubles: " + average);
        
        // Simulate some other unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Sum of numbers: " + total);
        
        /* read */ long readLastModifiedTime = entry.getLastModified();
        System.out.println("Last modified time: " + readLastModifiedTime);
        
        // Final operations
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("Final String List Element: " + stringList.get(i));
        }
    }
}