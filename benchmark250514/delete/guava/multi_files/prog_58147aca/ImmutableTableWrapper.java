import com.google.common.collect.ImmutableTable;

public class ImmutableTableWrapper {
    private ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();

    public void addEntry(String row, String column, Integer value) {
        /* write */ builder.put(row, column, value);
    }

    public ImmutableTable<String, String, Integer> buildTable() {
        return builder.build();
    }
}
