import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setFlags(3);

        // Additional complex operations
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        for (String str : stringList) {
            System.out.println("String in list: " + str);
        }

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Some arithmetic operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Logical operations
        boolean condition = true;
        if (condition) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        // Access the GzipParameters flags
        /* read */ int flags = gzipParameters.getFlags();
        System.out.println("Flags: " + flags);

        // Further operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        stringList.add("Gzip");
        stringList.add("Parameters");

        for (String str : stringList) {
            System.out.println("Updated string in list: " + str);
        }
    }
}