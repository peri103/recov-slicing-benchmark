import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile");

        // Additional code for complexity
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 100);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numberList.size(); i++) {
            map.put("Key" + i, numberList.get(i));
        }

        // Original write operation
        /* write */ entry.setUnixMode(0755);

        // More operations
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Original read operation
        /* read */ int mode = entry.getUnixMode();
        System.out.println("Unix Mode: " + Integer.toOctalString(mode));

        // Final operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}