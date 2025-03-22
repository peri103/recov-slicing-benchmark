import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        /* write */ treeSet.add(42);
        /* read */ boolean containsValue = treeSet.contains(42);
        System.out.println(containsValue);
    }
}