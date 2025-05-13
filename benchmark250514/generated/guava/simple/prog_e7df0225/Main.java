import com.google.common.collect.ImmutableTable;

public class Main {
    public static void main(String[] args) {
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        /* write */
        builder.put("row1", "column1", 42);
        
        ImmutableTable<String, String, Integer> table = builder.build();
        
        /* read */
        Integer value = table.get("row1", "column1");
        
        System.out.println(value);
    }
}