import org.apache.commons.collections4.set.ListOrderedSet;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<Integer> set = ListOrderedSet.listOrderedSet(new java.util.LinkedHashSet<>());
        /* write */ set.add(42);
        /* read */ int value = set.get(0);
        System.out.println(value);
    }
}