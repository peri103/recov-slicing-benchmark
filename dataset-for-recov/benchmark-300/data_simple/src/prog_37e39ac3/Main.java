import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        /* write */ set.add(10);
        /* read */ boolean contains = set.contains(10);
        System.out.println(contains);
    }
}