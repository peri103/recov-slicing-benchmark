import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.TreeBasedTable;

public class Main {
    public static void main(String[] args) {
        // Initialize a mutable table builder
        ImmutableTable.Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();

        // Using a HashBasedTable for additional operations
        Table<String, String, Double> hashTable = HashBasedTable.create();
        hashTable.put("row1", "column2", 3.14);
        hashTable.put("row2", "column1", 2.71);

        // Using a TreeBasedTable for another set of operations
        Table<String, String, String> treeTable = TreeBasedTable.create();
        treeTable.put("row1", "column1", "Hello");
        treeTable.put("row2", "column2", "World");

        /* write */ builder.put("row1", "column1", 42);

        // Perform some unrelated computations
        int sum = 0;
        for (double value : hashTable.values()) {
            sum += value;
        }
        System.out.println("Sum of hashTable values: " + sum);

        // Build the immutable table
        ImmutableTable<String, String, Integer> table = builder.build();

        // More operations on treeTable
        String greeting = treeTable.get("row1", "column1") + " " + treeTable.get("row2", "column2");
        System.out.println("Greeting: " + greeting);

        /* read */ Integer value = table.get("row1", "column1");

        System.out.println(value);

        // Perform additional operations on hashTable
        hashTable.put("row3", "column3", 1.618);
        double product = 1.0;
        for (double val : hashTable.values()) {
            product *= val;
        }
        System.out.println("Product of hashTable values: " + product);

        // Additional unrelated computations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}