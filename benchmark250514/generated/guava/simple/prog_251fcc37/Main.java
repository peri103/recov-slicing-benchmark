import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, String, Integer> builder = new ImmutableTable.Builder<String, String, Integer>();
        /* write */ builder.put("row1", "column1", 42);
        ImmutableTable<String, String, Integer> table = builder.build();
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println(value);
    }
}