import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableList.builder();
        /* write */ builder.add("Hello, World!");
        ImmutableList<String> list = builder.build();
        /* read */ String value = list.get(0);
        System.out.println(value);
    }
}