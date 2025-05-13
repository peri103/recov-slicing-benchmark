import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();
        /* write */ builder.put("rowKey", "columnKey", 42);
        ImmutableTable<String, String, Integer> table = builder.build();
        /* read */ Integer value = table.get("rowKey", "columnKey");
        System.out.println(value);
    }
}