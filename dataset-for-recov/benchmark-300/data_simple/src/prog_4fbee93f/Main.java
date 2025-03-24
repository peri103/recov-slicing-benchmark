import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        /* write */ set.add("value");
        /* read */ boolean containsValue = set.contains("value");
        System.out.println(containsValue);
    }
}