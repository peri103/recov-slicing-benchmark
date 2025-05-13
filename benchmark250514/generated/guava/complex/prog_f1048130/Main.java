import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<Integer, Integer, String> treeTable = TreeBasedTable.create();
        HashBasedTable<Integer, Integer, String> hashTable = HashBasedTable.create();
        
        // Initialize some values in hashTable
        hashTable.put(2, 2, "Guava");
        hashTable.put(3, 3, "Library");
        
        // Add more values to hashTable
        for (int i = 4; i <= 6; i++) {
            hashTable.put(i, i, "Value " + i);
        }

        // Print values from hashTable
        for (Table.Cell<Integer, Integer, String> cell : hashTable.cellSet()) {
            System.out.println("HashTable: (" + cell.getRowKey() + ", " + cell.getColumnKey() + ") = " + cell.getValue());
        }

        /* write */ treeTable.put(1, 1, "Hello, World!");
        
        // Manipulate treeTable with additional values
        for (int i = 2; i <= 5; i++) {
            treeTable.put(i, i, "Row " + i);
        }

        // Print values from treeTable
        for (Table.Cell<Integer, Integer, String> cell : treeTable.cellSet()) {
            System.out.println("TreeTable: (" + cell.getRowKey() + ", " + cell.getColumnKey() + ") = " + cell.getValue());
        }

        // Retrieve and print the original value
        /* read */ String value = treeTable.get(1, 1);
        System.out.println("Retrieved Value: " + value);
        
        // Additional operations with treeTable
        treeTable.put(6, 6, "End");
        System.out.println("TreeTable size: " + treeTable.size());
        System.out.println("Contains (1,1): " + treeTable.contains(1, 1));
    }
}