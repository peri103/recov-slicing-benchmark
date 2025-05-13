import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        byte[] extraData = {1, 2, 3, 4, 5};
        /* write */ zipEntry.setExtra(extraData);
        
        // Adding complexity with an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Adding complexity with a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            map.put("Key" + i, numbers.get(i));
        }

        // Processing data from the HashMap
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        
        System.out.println("Sum of values in map: " + sum);
        
        // More operations on ArrayList
        int product = 1;
        for (int num : numbers) {
            product *= num + 1; // Avoid zero multiplication
        }
        
        System.out.println("Product of modified numbers: " + product);
        
        // Reading the extra data from the zip entry
        /* read */ byte[] readExtraData = zipEntry.getExtra();
        
        System.out.print("Extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}