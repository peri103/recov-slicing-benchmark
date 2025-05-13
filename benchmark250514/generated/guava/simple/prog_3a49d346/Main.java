import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        /* write */ ImmutableList<Integer> list = ImmutableList.of(1, 2, 3);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}