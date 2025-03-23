import com.google.common.collect.HashBasedTable;

public class Main {
    public static void main(String[] args) {
        HashBasedTable<String, String, Integer> table = HashBasedTable.create();
        /* write */ table.put("row1", "column1", 42);
        /* read */ int value = table.get("row1", "column1");
        System.out.println(value);
    }
}