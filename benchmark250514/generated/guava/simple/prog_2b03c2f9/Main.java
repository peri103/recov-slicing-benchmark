import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        ImmutableList<String> rowKeys = ImmutableList.of("row1");
        ImmutableList<String> columnKeys = ImmutableList.of("column1");
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        /* write */ table.put("row1", "column1", 42);
        /* read */ Integer value = table.get("row1", "column1");
        
        System.out.println(value);
    }
}