import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        ImmutableTable.Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();
        /* write */ builder.put("rowKey1", "columnKey1", 42);
        ImmutableTable<String, String, Integer> table = builder.build();
        /* read */ Integer value = table.get("rowKey1", "columnKey1");
        System.out.println(value);
    }
}