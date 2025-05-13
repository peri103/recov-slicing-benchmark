import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.HashBasedTable;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<Integer, Integer, String> treeTable = TreeBasedTable.create();
        HashBasedTable<String, String, Integer> hashTable = HashBasedTable.create();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Populating the hash table
        hashTable.put("A", "X", 10);
        hashTable.put("B", "Y", 20);
        
        // Adding numbers to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        // Print all numbers in the list
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
        
        // Working with TreeBasedTable
        /* write */ treeTable.put(1, 1, "Hello, World!");
        
        // More operations with the hash table
        Integer valueFromHash = hashTable.get("A", "X");
        System.out.println("Value from HashBasedTable: " + valueFromHash);
        
        // Add more entries to the TreeBasedTable
        treeTable.put(2, 2, "Goodbye");
        treeTable.put(3, 3, "Hello Again");
        
        // Demonstrating retrieval from TreeBasedTable
        String anotherValue = treeTable.get(2, 2);
        System.out.println("Another value from TreeBasedTable: " + anotherValue);
        
        // Some more operations
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum of numbers: " + sum);
        
        /* read */ String value = treeTable.get(1, 1);
        
        System.out.println("Read value from TreeBasedTable: " + value);
    }
}