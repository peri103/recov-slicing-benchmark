import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = new ImmutableList.Builder<>();
        /* write */ builder.add(42);
        ImmutableList<Integer> list = builder.build();
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}