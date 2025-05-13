import com.google.common.collect.TreeBasedTable;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<Integer, Integer, String> table = TreeBasedTable.create();
        /* write */ table.put(1, 1, "Hello");
        /* read */ String value = table.get(1, 1);
        System.out.println(value);
    }
}