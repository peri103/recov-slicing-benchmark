import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        /* write */ set.add("example");
        /* read */ boolean containsValue = set.contains("example");
        System.out.println(containsValue);
    }
}