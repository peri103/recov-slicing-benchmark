import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class DataTable {
    private Table<String, String, Integer> table = HashBasedTable.create();

    public void putValue(String row, String column, Integer value) {
        /* write */ table.put(row, column, value);
    }

    public Integer getValue(String row, String column) {
        return table.get(row, column);
    }
}