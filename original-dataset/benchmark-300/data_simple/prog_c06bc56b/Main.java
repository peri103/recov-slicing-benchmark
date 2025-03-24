import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        /* write */ set.add(1);
        /* read */ boolean containsValue = set.contains(1);
        System.out.println(containsValue);
    }
}