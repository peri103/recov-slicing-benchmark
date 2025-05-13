import com.google.common.collect.ArrayTable;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> rowKeys = Arrays.asList("row1");
        List<String> columnKeys = Arrays.asList("col1");
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        /* write */ table.put("row1", "col1", 42);
        /* read */ Integer value = table.get("row1", "col1");
        
        System.out.println(value);
    }
}