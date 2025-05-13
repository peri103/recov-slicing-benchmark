import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        Table<String, String, Integer> table = HashBasedTable.create();
        /* write */ table.put("rowKey", "columnKey", 42);
        /* read */ Integer value = table.get("rowKey", "columnKey");
        System.out.println(value);
    }
}