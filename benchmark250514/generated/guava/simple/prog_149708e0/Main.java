import com.google.common.collect.ArrayTable;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> rows = Arrays.asList("row1");
        List<String> columns = Arrays.asList("col1");
        ArrayTable<String, String, Integer> table = ArrayTable.create(rows, columns);

        /* write */ table.put("row1", "col1", 10);
        /* read */ int value = table.get("row1", "col1");

        System.out.println(value);
    }
}