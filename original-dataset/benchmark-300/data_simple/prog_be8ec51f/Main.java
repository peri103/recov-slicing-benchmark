import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        /* write */ set.add("Hello");
        /* read */ boolean contains = set.contains("Hello");
        System.out.println(contains);
    }
}