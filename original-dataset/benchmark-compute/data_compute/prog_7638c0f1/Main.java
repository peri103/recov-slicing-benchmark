import java.util.concurrent.CopyOnWriteArraySet;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        int x = 42;
        boolean flag = false;
        if (x % 2 == 0) {
            flag = true;
        }
        if (!flag) {
            set.add(7);
            set.remove(5);
            set.add(9);
        } else {
            set.add(2);
        }
        /* write */ set.add(4);
        set.add(1);
        set.remove(3);
        set.add(6);
        /* read */ boolean isPresent = set.contains(4);
        System.out.println("Is 4 present? " + isPresent);
    }
}
