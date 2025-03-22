import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        /* write */ sortedSet.add(10);
        /* read */ boolean containsValue = sortedSet.contains(10);
        System.out.println(containsValue);
    }
}