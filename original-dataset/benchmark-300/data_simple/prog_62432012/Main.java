import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        /* write */ set.add(42);
        /* read */ boolean containsValue = set.contains(42);
        System.out.println(containsValue);
    }
}