import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters params = new GzipParameters();
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        for (String key : map.keySet()) {
            numbers.add(map.get(key));
        }
        
        /* write */ params.setOperatingSystem(3);
        
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number: " + numbers.get(i));
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        /* read */ int os = params.getOperatingSystem();
        
        if (os == 3) {
            System.out.println("Operating System set correctly: " + os);
        } else {
            System.out.println("Operating System not set correctly.");
        }
        
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Java");
        
        for (String word : words) {
            System.out.println("Word: " + word);
        }
        
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        
        System.out.println("Product of numbers: " + product);
    }
}