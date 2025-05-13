import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        /* write */ gzipParameters.setExtra(extraData);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            map.put("key" + i, numbers.get(i));
        }
        
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        /* read */ byte[] retrievedExtraData = gzipParameters.getExtra();
        
        System.out.print("Retrieved Extra Data: ");
        for (byte b : retrievedExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();
        
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        ArrayList<String> messages = new ArrayList<>();
        messages.add("Hello");
        messages.add("World");
        messages.add("This");
        messages.add("Is");
        messages.add("Java");
        
        for (String message : messages) {
            System.out.println(message);
        }
    }
}