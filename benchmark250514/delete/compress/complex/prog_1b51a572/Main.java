import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioArchiveEntry.FORMAT_NEW, 0);
        /* write */ entry.setName("exampleName");

        // Simulating some unrelated complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            map.put("Square of " + i, numbers.get(i));
        }

        int sum = 0;
        for (Integer value : numbers) {
            sum += value;
        }
        System.out.println("Sum of squares: " + sum);

        for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + " = " + entrySet.getValue());
        }

        // Continue with more operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Finally, read the name from the CpioArchiveEntry
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}