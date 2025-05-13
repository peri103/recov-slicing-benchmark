import com.google.common.collect.ImmutableTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize an ImmutableTable builder
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Add a value to the table
        /* write */ builder.put("row1", "column1", 42);
        
        // Create a HashBasedTable to perform additional operations
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        
        // Add some values to the HashBasedTable
        hashTable.put("row2", "column2", 84);
        hashTable.put("row3", "column3", 126);
        
        // Perform some operations on the HashBasedTable
        Integer valueFromHashTable = hashTable.get("row2", "column2");
        System.out.println("Value from hashTable: " + valueFromHashTable);
        
        // Create a list and perform some operations
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        // Print the values from the list
        for (Integer num : numberList) {
            System.out.println("List value: " + num);
        }
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Perform some unrelated complex operations
        int sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }
        
        // Print the sum of the list
        System.out.println("Sum of list values: " + sum);
        
        // Read the value from the ImmutableTable
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("Value from ImmutableTable: " + value);
    }
}