import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        
        // Additional code to manipulate a list
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i);
        }
        
        // Manipulate a map
        HashMap<String, Integer> nameToAgeMap = new HashMap<>();
        nameToAgeMap.put("Alice", 30);
        nameToAgeMap.put("Bob", 25);

        // Perform some operations on the map
        int aliceAge = nameToAgeMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge);

        // Set the compression level
        /* write */ gzipParams.setCompressionLevel(5);
        
        // Manipulate the list
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // More operations on the map
        nameToAgeMap.put("Charlie", 35);
        for (String name : nameToAgeMap.keySet()) {
            System.out.println(name + " is " + nameToAgeMap.get(name) + " years old.");
        }

        // Read the compression level
        /* read */ int compressionLevel = gzipParams.getCompressionLevel();
        System.out.println("Compression Level: " + compressionLevel);
        
        // Further manipulation of the list
        numberList.add(100);
        System.out.println("Last number in list: " + numberList.get(numberList.size() - 1));
    }
}