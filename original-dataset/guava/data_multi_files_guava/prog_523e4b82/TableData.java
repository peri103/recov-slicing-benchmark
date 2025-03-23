import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.TableBuilder;

public class TableData {
    private Table<String, String, Integer> table;

    public TableData() {
        TableBuilder<String, String, Integer> tableBuilder = HashBasedTable.create().builder();
        this.table = tableBuilder.build();
    }

    public void addData(String row, String column, Integer value) {
        /* write */ table.put(row, column, value);
    }

    public Integer getData(String row, String column) {
        return table.get(row, column);
    }
}
