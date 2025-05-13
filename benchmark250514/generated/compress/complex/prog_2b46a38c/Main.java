import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        byte[] extraData = {0x01, 0x02, 0x03, 0x04};
        
        /* write */ entry.setExtra(extraData);

        // Using ArrayList to store some data
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 5);
        }

        // Using HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put("Key" + i, i * 10);
        }

        // Processing data in numberList
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Processing data in map
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        /* read */ byte[] retrievedData = entry.getExtra();
        
        for (byte b : retrievedData) {
            System.out.printf("0x%02X ", b);
        }
        
        // Adding more complexity with mathematical operations
        double result = Math.pow(sum, 2) / 2.5;
        System.out.println("\nComplex result: " + result);

        // More operations on the numberList
        numberList.add(sum);
        numberList.remove(0);
        System.out.println("Modified numberList: " + numberList);
    }
}