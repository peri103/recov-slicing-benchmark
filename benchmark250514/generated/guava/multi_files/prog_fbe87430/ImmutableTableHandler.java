import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class ImmutableTableHandler {
    private Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();
    private ImmutableTable<String, String, Integer> table;

    public void putValue(String row, String column, Integer value) {
        /* write */ builder.put(row, column, value);
        table = builder.build();
    }

    public Integer getValue(String row, String column) {
        return table.get(row, column);
    }
}
