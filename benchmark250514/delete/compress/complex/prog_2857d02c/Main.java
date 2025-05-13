import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example", 1000);
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("item1", 10);
        itemMap.put("item2", 20);
        itemMap.put("item3", 30);
        
        /* write */ entry.setExtra(extraData);

        for (Map.Entry<String, Integer> entrySet : itemMap.entrySet()) {
            System.out.println("Key: " + entrySet.getKey() + ", Value: " + entrySet.getValue());
        }

        int sum = 0;
        for (Integer value : itemMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);
        
        // Additional unrelated complex logic
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        /* read */ byte[] readExtraData = entry.getExtra();
        
        System.out.print("Extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();

        // More complex logic
        int fibonacci[] = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < 10; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.print("Fibonacci series: ");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}