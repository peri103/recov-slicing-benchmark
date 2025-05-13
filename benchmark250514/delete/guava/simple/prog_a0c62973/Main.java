import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        RowSortedTable<Integer, String, String> table = HashBasedTable.create();
        
        /* write */ table.put(1, "key1", "value1");
        
        /* read */ String value = table.get(1, "key1");
        System.out.println(value);
    }
}