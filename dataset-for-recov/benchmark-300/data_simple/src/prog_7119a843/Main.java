import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        /* write */ set.add(10);
        /* read */ boolean contains = set.contains(10);
        System.out.println(contains);
    }
}