import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        /* write */ set.add("Hello");
        /* read */ boolean contains = set.contains("Hello");
        System.out.println(contains);
    }
}