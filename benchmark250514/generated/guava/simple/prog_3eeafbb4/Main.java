import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableList.builder();
        /* write */ builder.add(1);
        ImmutableList<Integer> list = builder.build();
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}