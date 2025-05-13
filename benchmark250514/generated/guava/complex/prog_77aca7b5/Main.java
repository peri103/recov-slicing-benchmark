import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableTable
        Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();

        // Use the put method to add a value
        /* write */ builder.put("row1", "column1", 42);

        // Create a HashBasedTable for additional complexity
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", "Hello");
        hashTable.put("row3", "column3", "World");

        // Perform some operations on the HashBasedTable
        String value1 = hashTable.get("row2", "column2");
        String value2 = hashTable.get("row3", "column3");
        System.out.println(value1 + " " + value2);

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Perform some dummy calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 9: " + sum);

        // Use the get method to retrieve the value
        /* read */ Integer value = table.get("row1", "column1");

        // Print the retrieved value
        System.out.println("Retrieved value: " + value);

        // Additional operations with the HashBasedTable
        hashTable.put("row4", "column4", "Guava");
        System.out.println("New entry in hashTable: " + hashTable.get("row4", "column4"));
    }
}