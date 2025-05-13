import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;

public class Main {
    public static void main(String[] args) {
        RowSortedTable<String, String, Integer> table = HashBasedTable.create();
        /* write */ table.put("row1", "column1", 42);
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println(value);
    }
}