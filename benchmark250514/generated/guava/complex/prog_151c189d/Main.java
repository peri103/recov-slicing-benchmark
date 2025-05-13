import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableTable and put a value
        ImmutableTable.Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();
        /* write */ builder.put("rowKey1", "columnKey1", 42);
        ImmutableTable<String, String, Integer> table = builder.build();

        // Create a HashBasedTable and perform operations
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("rowKeyA", "columnKeyA", "ValueA");
        hashTable.put("rowKeyB", "columnKeyB", "ValueB");

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read from the ImmutableTable
        /* read */ Integer value = table.get("rowKey1", "columnKey1");
        System.out.println(value);

        // Additional operations with HashBasedTable
        String retrievedValueA = hashTable.get("rowKeyA", "columnKeyA");
        String retrievedValueB = hashTable.get("rowKeyB", "columnKeyB");
        System.out.println("Retrieved Value A: " + retrievedValueA);
        System.out.println("Retrieved Value B: " + retrievedValueB);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}