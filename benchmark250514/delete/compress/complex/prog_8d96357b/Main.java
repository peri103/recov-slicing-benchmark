import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> stringCountMap = new HashMap<>();
        
        // Add some elements to the list
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        
        // Count occurrences of each string
        for (String fruit : stringList) {
            stringCountMap.put(fruit, stringCountMap.getOrDefault(fruit, 0) + 1);
        }
        
        /* write */ gzipParameters.setHeaderCRC(true);
        
        // Perform some operations with the map
        int totalFruits = 0;
        for (Integer count : stringCountMap.values()) {
            totalFruits += count;
        }
        
        // Print the map and total count
        System.out.println("Fruit count map: " + stringCountMap);
        System.out.println("Total fruits: " + totalFruits);
        
        // Perform more operations on the list
        stringList.add("grape");
        stringList.remove("banana");
        
        /* read */ boolean headerCRC = gzipParameters.getHeaderCRC();
        
        // Print the final list and header CRC status
        System.out.println("Final fruit list: " + stringList);
        System.out.println("Header CRC is set to: " + headerCRC);
    }
}