import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        /* write */ set.add(10);
        /* read */ boolean containsValue = set.contains(10);
        System.out.println(containsValue);
    }
}