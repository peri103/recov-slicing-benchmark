import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Populate the ArrayList with numbers
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Populate the HashMap with some key-value pairs
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        /* write */ gzipParameters.setHeaderCRC(true);
        
        // Perform some operations on the ArrayList
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Perform some operations on the HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Additional logic
        int maxNumber = numbers.stream().max(Integer::compare).orElse(-1);
        System.out.println("Max number in list: " + maxNumber);
        
        /* read */ boolean headerCRC = gzipParameters.getHeaderCRC();
        
        System.out.println("Header CRC: " + headerCRC);
    }
}