import com.google.common.collect.ImmutableTable;

public class DataProcessor {
    private ImmutableTable<String, String, Integer> table;

    public DataProcessor(ImmutableTable<String, String, Integer> table) {
        this.table = table;
    }

    public Integer getValue(String row, String column) {
        /* read */ return table.get(row, column);
    }
}
