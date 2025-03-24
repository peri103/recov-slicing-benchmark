import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        /* write */ set.add("testValue");
        /* read */ boolean containsValue = set.contains("testValue");
        System.out.println(containsValue);
    }
}