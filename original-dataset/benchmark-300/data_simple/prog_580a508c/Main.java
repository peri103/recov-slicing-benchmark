import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        /* write */ set.add("test");
        /* read */ boolean contains = set.contains("test");
        System.out.println(contains);
    }
}