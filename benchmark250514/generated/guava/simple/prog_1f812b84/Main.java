import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedSet<Integer> set = ImmutableSortedSet.of(1, 2, 3, 4, 5); // /* write */
        boolean containsValue = set.contains(3); // /* read */
        System.out.println(containsValue);
    }
}