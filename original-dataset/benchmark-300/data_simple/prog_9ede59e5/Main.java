import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        /* write */ set.add("testValue");
        /* read */ boolean containsValue = set.contains("testValue");
        System.out.println(containsValue);
    }
}