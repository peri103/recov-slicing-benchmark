import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        Map<String, Integer> dataMap = new HashMap<>();
        ArrayList<Integer> dataList = new ArrayList<>();

        // Insert some values into the map
        dataMap.put("One", 1);
        dataMap.put("Two", 2);
        dataMap.put("Three", 3);

        // Insert values into the list
        for (int i = 0; i < 5; i++) {
            dataList.add(i * 10);
        }

        // Perform some operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of map values: " + sum);

        // Perform some operations on the list
        for (int value : dataList) {
            System.out.println("List value: " + value);
        }

        /* write */ gzipParameters.setISize(12345);

        // Perform more operations
        int product = 1;
        for (int value : dataList) {
            product *= value == 0 ? 1 : value;
        }
        System.out.println("Product of non-zero list values: " + product);

        // Retrieve the ISize value
        /* read */ int iSize = gzipParameters.getISize();
        System.out.println("ISize: " + iSize);

        // Perform some final operations
        for (int i = 0; i < dataList.size(); i++) {
            dataList.set(i, dataList.get(i) + iSize);
        }

        // Print the modified list
        for (int value : dataList) {
            System.out.println("Modified list value: " + value);
        }
    }
}