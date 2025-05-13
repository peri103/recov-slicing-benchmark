import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableTable
        Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Use the builder to add a single entry to the table
        /* write */ builder.put("row1", "column1", 42);

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Initialize a HashBasedTable for additional operations
        Table<String, String, Double> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", 3.14);
        hashTable.put("row3", "column3", 2.71);

        // Perform some operations on the HashBasedTable
        Double value1 = hashTable.get("row2", "column2");
        Double value2 = hashTable.get("row3", "column3");
        System.out.println("Value from HashBasedTable: " + value1 + ", " + value2);

        // More complex operations with the HashBasedTable
        for (Table.Cell<String, String, Double> cell : hashTable.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }

        // Read the value from the ImmutableTable
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("Value from ImmutableTable: " + value);

        // Further unrelated operations to increase complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Perform a calculation using values from HashBasedTable
        double calculation = value1 * value2;
        System.out.println("Calculation result: " + calculation);
    }
}