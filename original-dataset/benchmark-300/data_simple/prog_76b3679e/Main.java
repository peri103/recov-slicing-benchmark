import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        /* write */ set.add(42);
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Contains 42: " + containsValue);
    }
}