import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        /* write */ set.add("example");
        /* read */ boolean contains = set.contains("example");
        System.out.println(contains);
    }
}