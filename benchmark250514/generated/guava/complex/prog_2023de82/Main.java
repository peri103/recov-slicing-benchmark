import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original RowSortedTable example
        RowSortedTable<String, String, Integer> table = TreeBasedTable.create();
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 5);
        }
        
        /* write */ table.put("row1", "column1", 42);
        
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        hashTable.put("rowA", "columnA", 100);
        hashTable.put("rowB", "columnB", 200);
        
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        
        Integer hashValue = hashTable.get("rowA", "columnA");
        System.out.println("Value from HashBasedTable: " + hashValue);
        
        System.out.println("Sum of list elements: " + sum);
        
        /* read */ Integer value = table.get("row1", "column1");
        
        System.out.println("Value from RowSortedTable: " + value);
        
        hashTable.put("rowC", "columnC", sum);
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
    }
}