import java.util.concurrent.CopyOnWriteArraySet;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(3);
        set.add(5);
        set.add(7);
        int hash = 0;
        for (int i = 0; i < 100; i++) {
            hash += i;
        }
        boolean condition = (hash % 2 == 0);
        if (condition) {
            /* write */ set.add(42); 
        } else {
            set.add(100);
        }
        set.add(99);
        set.add(101);
        set.remove(3);
        set.remove(5);
        /* read */ boolean exists = set.contains(42);
        System.out.println("Read value: " + exists);
    }
}
