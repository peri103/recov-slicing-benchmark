import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        /* write */ treeSet.add(10);
        /* read */ boolean containsValue = treeSet.contains(10);
        System.out.println(containsValue);
    }
}