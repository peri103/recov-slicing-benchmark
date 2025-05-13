import com.google.common.collect.ArrayTable;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> rowKeys = Arrays.asList("row1");
        List<String> columnKeys = Arrays.asList("column1");
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        /* write */ table.put("row1", "column1", 42);
        /* read */ Integer value = table.get("row1", "column1");
        
        System.out.println(value);
    }
}