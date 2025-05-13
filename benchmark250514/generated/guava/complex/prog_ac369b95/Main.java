import com.google.common.collect.ImmutableTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        /* write */ builder.put("row1", "column1", 42);

        // Additional complex code using HashBasedTable
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", 100);
        hashTable.put("row3", "column3", 200);

        // Manipulating the hashTable
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }

        // Building the original table
        ImmutableTable<String, String, Integer> table = builder.build();

        // Additional operations
        Integer sum = 0;
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            sum += cell.getValue();
        }
        System.out.println("Sum of hashTable values: " + sum);

        // Original read operation
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("ImmutableTable value: " + value);

        // More complex operations
        for (int i = 0; i < 3; i++) {
            hashTable.put("row" + (i + 4), "column" + (i + 4), i * 50);
        }

        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            System.out.println("Updated Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
    }
}