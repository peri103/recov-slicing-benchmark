import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Table<String, String, Integer> table = HashBasedTable.create();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> keys = new ArrayList<>();
        
        // Adding elements to the ArrayList
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
            keys.add("key" + i);
        }

        // Performing operations on the ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number: " + numbers.get(i));
        }
        
        /* write */ table.put("row1", "column1", 42);

        // Adding more elements to the table
        for (int i = 0; i < keys.size(); i++) {
            table.put("row" + i, "column" + i, numbers.get(i));
        }

        // Performing operations on the table
        for (int i = 0; i < keys.size(); i++) {
            Integer value = table.get("row" + i, "column" + i);
            System.out.println("Table value at row" + i + ", column" + i + ": " + value);
        }

        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("Read value: " + value);

        // Further operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}