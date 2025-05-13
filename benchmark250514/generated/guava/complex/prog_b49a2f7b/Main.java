import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.ArrayTable;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Original Table
        Table<String, String, Integer> table = HashBasedTable.create();
        /* write */ table.put("rowKey", "columnKey", 42);

        // New Table with different data
        List<String> rowKeys = Arrays.asList("A", "B");
        List<String> columnKeys = Arrays.asList("X", "Y");
        Table<String, String, String> table2 = ArrayTable.create(rowKeys, columnKeys);
        table2.put("A", "X", "Alpha");
        table2.put("A", "Y", "Beta");
        table2.put("B", "X", "Gamma");
        table2.put("B", "Y", "Delta");

        // Process data from table2
        for (String row : rowKeys) {
            for (String column : columnKeys) {
                String data = table2.get(row, column);
                System.out.println("Table2: " + data);
            }
        }

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Read from the original table
        /* read */ Integer value = table.get("rowKey", "columnKey");
        System.out.println("Value from table: " + value);

        // Additional logic to manipulate data
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 natural numbers: " + product);

        // Further operations on table2
        table2.put("A", "X", "Updated Alpha");
        String updatedData = table2.get("A", "X");
        System.out.println("Updated data in table2: " + updatedData);
    }
}