import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<Integer, Integer, String> table = TreeBasedTable.create();
        /* write */ table.put(1, 1, "Hello, World!");
        /* read */ String value = table.get(1, 1);
        System.out.println(value);
    }
}