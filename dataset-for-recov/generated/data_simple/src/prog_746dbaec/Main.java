import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        /* write */ set.add(42);
        /* read */ boolean containsValue = set.contains(42);
        System.out.println(containsValue);
    }
}