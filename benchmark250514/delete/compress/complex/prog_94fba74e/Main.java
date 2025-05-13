import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = {1, 2, 3, 4, 5};
        
        /* write */ gzipParameters.setExtra(extraData);
        
        // Adding a complex data structure
        HashMap<String, ArrayList<Integer>> complexMap = new HashMap<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            list1.add(i);
            list2.add(i * 10);
        }
        
        complexMap.put("list1", list1);
        complexMap.put("list2", list2);
        
        // Manipulating the data
        for (String key : complexMap.keySet()) {
            ArrayList<Integer> list = complexMap.get(key);
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) + 1);
            }
        }
        
        // Another unrelated operation
        int sum = 0;
        for (int i : complexMap.get("list1")) {
            sum += i;
        }
        System.out.println("Sum of list1: " + sum);
        
        // More operations
        int product = 1;
        for (int i : complexMap.get("list2")) {
            product *= i == 0 ? 1 : i; // Avoid multiplying by zero
        }
        System.out.println("Product of list2: " + product);
        
        // Retrieve and print the extra data from GzipParameters
        /* read */ byte[] retrievedData = gzipParameters.getExtra();
        
        System.out.print("Retrieved extra data: ");
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}