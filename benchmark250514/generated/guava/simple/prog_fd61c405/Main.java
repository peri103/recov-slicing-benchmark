import com.google.common.collect.ArrayTable;
import com.google.common.collect.Lists;

public class Main {
    public static void main(String[] args) {
        // Initialize the row and column keys for the ArrayTable
        java.util.List<String> rowKeys = Lists.newArrayList("row1");
        java.util.List<String> columnKeys = Lists.newArrayList("column1");

        // Create an ArrayTable with the specified row and column keys
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        /* write */ table.put("row1", "column1", 42);

        /* read */ Integer value = table.get("row1", "column1");
        System.out.println(value);
    }
}