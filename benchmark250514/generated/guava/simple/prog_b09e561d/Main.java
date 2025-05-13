import com.google.common.collect.ArrayTable;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> rowKeys = List.of("Row1");
        List<String> columnKeys = List.of("Column1");
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        /* write */ table.put("Row1", "Column1", 42);
        /* read */ Integer value = table.get("Row1", "Column1");
        
        System.out.println(value);
    }
}