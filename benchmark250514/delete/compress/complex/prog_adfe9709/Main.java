import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        CpioArchiveEntry entry = new CpioArchiveEntry("test", 1000);
        /* write */ entry.setFileType(CpioArchiveEntry.C_ISREG);

        // Additional unrelated code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Some calculations
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum: " + sum);

        // More operations
        numbers.add(10);
        map.put("three", 3);

        // Original read operation, far from the write
        /* read */ int fileType = entry.getFileType();
        System.out.println("File Type: " + fileType);

        // Final operations
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product: " + product);
    }
}