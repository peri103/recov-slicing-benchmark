import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.TableBuilder;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Initialize the TableBuilder
        TableBuilder<String, String, Integer> tableBuilder = HashBasedTable.create().builder();
        
        // Create the Table
        Table<String, String, Integer> table = tableBuilder.build();
        
        // /* write */ Use the put method to write a value into the table
        table.put("row1", "column1", 42);
        
        // Create additional collections for complexity
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();
        
        // Fill the ArrayList with some values
        for (int i = 0; i < 5; i++) {
            list1.add(i * 10);
        }
        
        // Fill the LinkedList with some string values
        list2.add("First");
        list2.add("Second");
        list2.add("Third");
        
        // Process the lists
        for (Integer num : list1) {
            System.out.println("Number: " + num);
        }
        
        // Access elements from the LinkedList
        for (String str : list2) {
            System.out.println("String: " + str);
        }
        
        // /* read */ Use the get method to read the value from the table
        int value = table.get("row1", "column1");
        
        // Print the retrieved value
        System.out.println(value);
        
        // Additional complexity with another ArrayList
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list3.add(i * 20);
        }
        
        // Print values from the third list
        for (int i = 0; i < list3.size(); i++) {
            System.out.println("Value from list3: " + list3.get(i));
        }
    }
}