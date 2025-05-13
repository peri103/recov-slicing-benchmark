import com.google.common.collect.ArrayTable;
import com.google.common.collect.Lists;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize the row and column keys for the ArrayTable
        java.util.List<String> rowKeys = Lists.newArrayList("row1", "row2");
        java.util.List<String> columnKeys = Lists.newArrayList("column1", "column2");

        // Create an ArrayTable with the specified row and column keys
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        /* write */ table.put("row1", "column1", 42);

        // Create a HashBasedTable for additional operations
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("key1", "subKey1", "value1");
        hashTable.put("key2", "subKey2", "value2");

        // Perform some operations on the hashTable
        String hashValue = hashTable.get("key1", "subKey1");
        System.out.println("Hash Table Value: " + hashValue);

        // Iterate over the hashTable
        for (Table.Cell<String, String, String> cell : hashTable.cellSet()) {
            System.out.println("Hash Table Cell: " + cell.getRowKey() + ", " + cell.getColumnKey() + " = " + cell.getValue());
        }

        // Perform calculations and store results in the ArrayTable
        int sum = 0;
        for (String rowKey : rowKeys) {
            for (String columnKey : columnKeys) {
                if (table.contains(rowKey, columnKey)) {
                    sum += table.get(rowKey, columnKey);
                }
            }
        }
        System.out.println("Sum of ArrayTable values: " + sum);

        // Perform some unrelated operations
        int unrelatedCalculation = 5 * 10;
        System.out.println("Unrelated Calculation: " + unrelatedCalculation);

        /* read */ Integer value = table.get("row1", "column1");
        System.out.println(value);

        // Additional operations on ArrayTable
        table.put("row2", "column2", 100);
        Integer newValue = table.get("row2", "column2");
        System.out.println("New Value: " + newValue);
    }
}