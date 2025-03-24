import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        /* write */ set.add(1);
        /* read */ boolean value = set.contains(1);
        System.out.println(value);
    }
}