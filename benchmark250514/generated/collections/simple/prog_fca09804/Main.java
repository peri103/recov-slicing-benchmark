import org.apache.commons.collections4.set.ListOrderedSet;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<Integer> listOrderedSet = ListOrderedSet.listOrderedSet(new java.util.LinkedHashSet<>());
        /* write */ listOrderedSet.add(42);
        /* read */ Integer value = listOrderedSet.get(0);
        System.out.println(value);
    }
}