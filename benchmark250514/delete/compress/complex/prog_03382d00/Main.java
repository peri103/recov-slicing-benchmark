import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt", 100);
        /* write */ entry.setMode(755);
        
        // Additional code to increase complexity
        Map<String, Integer> map = new HashMap<>();
        map.put("entry1", entry.getMode());
        map.put("entry2", 644);
        
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Simulate some complex operations
        int complexCalculation = (sum * 2) + map.get("entry2");
        System.out.println("Result of complex calculation: " + complexCalculation);
        
        // Ensure original read method is far apart
        /* read */ int mode = entry.getMode();
        System.out.println("Retrieved mode: " + mode);
    }
}