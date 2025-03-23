import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer, Integer, String> builder = ImmutableTable.builder();
        /* write */ builder.put(1, 2, "Hello");
        ImmutableTable<Integer, Integer, String> table = builder.build();
        /* read */ String value = table.get(1, 2);
        System.out.println(value);
    }
}