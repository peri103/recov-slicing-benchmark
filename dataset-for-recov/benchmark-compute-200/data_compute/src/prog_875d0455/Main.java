import java.util.concurrent.CopyOnWriteArraySet;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        if (set.size() > 5) {
            set.add(100);
        }
        set.add(-1);
        set.remove(-1);
        int misleadingValue = set.size() == 10 ? 5 : 20;
        set.add(misleadingValue);
        int keyValue = 42;
        set.add(keyValue);
        if (set.contains(58)) {
            set.add(300);
        } else {
            set.remove(1);
        }
        set.add(101);
        if (set.size() == 13) {
            set.remove(100);
        } else {
            /* write */ set.add(7);
        }
        set.add(11);
        set.remove(5);
        /* read */ boolean ret = set.contains(7);
        System.out.println("The value at read point is: " + ret);
    }
}
