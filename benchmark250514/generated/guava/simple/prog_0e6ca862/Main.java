import com.google.common.collect.ArrayTable;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> rowKeys = new ArrayList<>();
        List<String> columnKeys = new ArrayList<>();
        rowKeys.add("row1");
        columnKeys.add("column1");
        
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        /* write */ table.put("row1", "column1", 42);
        /* read */ Integer value = table.get("row1", "column1");
        
        System.out.println(value);
    }
}