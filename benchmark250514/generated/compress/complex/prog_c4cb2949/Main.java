import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        
        // Unrelated code for complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
            map.put("key" + i, i * 100);
        }
        
        // Manipulating numbers
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        // Manipulating map
        for (String key : map.keySet()) {
            System.out.println("Map value for " + key + ": " + map.get(key));
        }
        
        /* write */ entry.setCompressedSize(1024L);
        
        // More unrelated code for complexity
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        int mapSum = 0;
        for (String key : map.keySet()) {
            mapSum += map.get(key);
        }
        System.out.println("Sum of map values: " + mapSum);
        
        /* read */ long compressedSize = entry.getCompressedSize();
        System.out.println("Compressed size: " + compressedSize);
    }
}