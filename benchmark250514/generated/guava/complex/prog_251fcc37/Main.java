import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        Builder<String, String, Integer> builder = new ImmutableTable.Builder<String, String, Integer>();
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        
        // Adding multiple entries to hashTable
        hashTable.put("row2", "column2", 100);
        hashTable.put("row3", "column3", 200);
        
        /* write */ builder.put("row1", "column1", 42);
        
        // Some unrelated operations
        int sum = 0;
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            sum += cell.getValue();
        }
        
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // More operations
        for (String row : hashTable.rowKeySet()) {
            for (String column : hashTable.columnKeySet()) {
                Integer value = hashTable.get(row, column);
                if (value != null) {
                    System.out.println("Value at " + row + ", " + column + ": " + value);
                }
            }
        }
        
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println(value);
        
        // Additional complex operations
        int product = 1;
        for (Integer val : hashTable.values()) {
            product *= val;
        }
        
        System.out.println("Sum of hashTable values: " + sum);
        System.out.println("Product of hashTable values: " + product);
    }
}