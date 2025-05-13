import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setLinkName("exampleLink");

        // Unrelated operations to increase complexity
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 2);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (Integer number : numberList) {
            map.put("Key" + number, number);
        }

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }

        System.out.println("Sum of numbers in map: " + sum);

        // Another unrelated operation
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int product = 1;
        for (int num : array) {
            product *= num;
        }

        System.out.println("Product of array elements: " + product);

        // Read operation
        /* read */ String linkName = entry.getLinkName();
        System.out.println("Link Name: " + linkName);
    }
}