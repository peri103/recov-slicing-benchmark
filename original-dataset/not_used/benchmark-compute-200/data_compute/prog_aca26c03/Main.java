import java.util.concurrent.CopyOnWriteArraySet;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i * 10);
        }
        int x = 42;
        int y = x * 2 + 1;
        if (y % 3 == 0) {
            set.add(30);
        } else {
            set.add(25);
        }
        set.add(999);
        set.remove(999);
        boolean shouldWrite = (y % 2 == 0) || set.contains(25);
        if (shouldWrite) {
            /* write */ set.add(15);
        }
        set.remove(20);
        set.add(50);
        Integer ret = null;
        int index = 0;
        for (Integer val : set) {
            if (index == 1) {
                /* read */ ret = val;
                break;
            }
            index++;
        }
        System.out.println("Retrieved value: " + ret);
    }
}