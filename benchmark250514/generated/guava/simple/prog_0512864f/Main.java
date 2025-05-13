import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<String, String, Integer> table = TreeBasedTable.create();
        
        /* write */ table.put("row1", "column1", 42);
        
        /* read */ Integer value = table.get("row1", "column1");
        
        System.out.println(value);
    }
}