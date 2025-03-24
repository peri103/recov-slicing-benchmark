import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        for (int i = 0; i < 3; i++) {
            set.add(i * 10 + 5);
            if (i % 2 == 0) {
                set.remove(i * 10);
            }
        }
        int trigger = (int) (Math.random() * 10);
        if (trigger % 3 == 0) {
            set.add(trigger);
        }
        /* write */set.add(42);
        for (int i = 0; i < 5; i++) {
            set.add(i * 2 + 3);
            set.remove(i);
        }
        boolean found = false;
        int ret = -1;
        for (Integer val : set) {
            if (val == 42) {
                /* read */ret = val;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found: " + ret);
        } else {
            System.out.println("Value not found.");
        }
    }
}
