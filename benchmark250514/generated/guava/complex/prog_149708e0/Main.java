import com.google.common.collect.ArrayTable;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> rows = Arrays.asList("row1", "row2");
        List<String> columns = Arrays.asList("col1", "col2");
        ArrayTable<String, String, Integer> table = ArrayTable.create(rows, columns);

        /* write */ table.put("row1", "col1", 10);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(25);

        for (String row : rows) {
            for (String column : columns) {
                table.put(row, column, map.getOrDefault("key1", 0) + list.get(0));
            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of list elements: " + sum);

        /* read */ int value = table.get("row1", "col1");
        System.out.println("Value from table: " + value);

        for (String row : rows) {
            for (String column : columns) {
                System.out.println("Table [" + row + "][" + column + "] = " + table.get(row, column));
            }
        }
    }
}