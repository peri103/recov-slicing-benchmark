import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArrayTable
        ImmutableList<String> rowKeys = ImmutableList.of("row1", "row2");
        ImmutableList<String> columnKeys = ImmutableList.of("column1", "column2");
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        /* write */ table.put("row1", "column1", 42);
        
        // Additional complex operations using HashBasedTable
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        hashTable.put("row1", "column1", 100);
        hashTable.put("row2", "column2", 200);
        
        int hashValue1 = hashTable.get("row1", "column1");
        int hashValue2 = hashTable.get("row2", "column2");
        
        System.out.println("Hash Table Values:");
        System.out.println("row1, column1: " + hashValue1);
        System.out.println("row2, column2: " + hashValue2);
        
        // Perform calculations using values from hashTable
        int sum = hashValue1 + hashValue2;
        System.out.println("Sum of values: " + sum);
        
        // Add more values to the hashTable
        hashTable.put("row1", "column2", 300);
        hashTable.put("row2", "column1", 400);
        
        int hashValue3 = hashTable.get("row1", "column2");
        int hashValue4 = hashTable.get("row2", "column1");
        
        System.out.println("Additional Hash Table Values:");
        System.out.println("row1, column2: " + hashValue3);
        System.out.println("row2, column1: " + hashValue4);
        
        // Perform operations using the ArrayTable
        int product = hashValue3 * hashValue4;
        System.out.println("Product of additional values: " + product);
        
        // Finally, read from the ArrayTable
        /* read */ Integer value = table.get("row1", "column1");
        
        System.out.println("Array Table Value:");
        System.out.println(value);
    }
}