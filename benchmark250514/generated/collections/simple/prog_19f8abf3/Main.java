import org.apache.commons.collections4.set.ListOrderedSet;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(new java.util.HashSet<String>());
        /* write */ set.add("Hello World");
        /* read */ String value = set.get(0);
        System.out.println(value);
    }
}