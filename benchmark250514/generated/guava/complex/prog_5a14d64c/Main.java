import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Table<String, String, Integer> table = HashBasedTable.create();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Map<String, Integer> hashMap = new HashMap<>();

        arrayList.add(10);
        arrayList.add(20);
        hashMap.put("key1", 100);
        hashMap.put("key2", 200);

        /* write */ table.put("row1", "column1", 42);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList Element " + i + ": " + arrayList.get(i));
        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        int additionalValue = hashMap.getOrDefault("key3", 300);
        System.out.println("Additional Value: " + additionalValue);

        // Some unrelated complex logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        /* read */ int value = table.get("row1", "column1");

        System.out.println("Value from Table: " + value);

        // More complex logic
        int product = 1;
        for (int num : arrayList) {
            product *= num;
        }
        System.out.println("Product of ArrayList elements: " + product);

        hashMap.put("key3", product);
        System.out.println("Updated HashMap with product: " + hashMap.get("key3"));
    }
}