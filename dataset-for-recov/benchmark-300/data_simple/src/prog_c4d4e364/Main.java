import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        /* write */ set.add(10);
        /* read */ boolean containsValue = set.contains(10);
        System.out.println(containsValue);
    }
}