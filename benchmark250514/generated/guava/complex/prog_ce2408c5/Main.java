import com.google.common.collect.ImmutableTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        /* write */ builder.put("row1", "column1", 42);
        
        // Create a HashBasedTable and add some data
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", 100);
        hashTable.put("row3", "column3", 200);
        
        // Perform some operations on HashBasedTable
        Integer valueFromHashTable = hashTable.get("row2", "column2");
        System.out.println("Value from HashBasedTable: " + valueFromHashTable);
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Create an ArrayList and populate it with data
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Perform operations on ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList value: " + list.get(i));
        }
        
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value from ImmutableTable
        System.out.println("Value from ImmutableTable: " + value);
        
        // Perform more operations on HashBasedTable
        hashTable.put("row4", "column4", 300);
        Integer anotherValueFromHashTable = hashTable.get("row4", "column4");
        System.out.println("Another value from HashBasedTable: " + anotherValueFromHashTable);
    }
}