import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        /* write */ set.add(1);
        /* read */ boolean containsValue = set.contains(1);
        System.out.println(containsValue);
    }
}