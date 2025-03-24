import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("Unrelated iteration: " + iterator.next());
        }
        int unrelated = 50 * 2 + 3;
        if (unrelated % 5 == 0) {
            set.add(25);
        } else {
            set.add(15);
        }
        set.add(40);
        set.remove(10);
        if (unrelated % 10 == 0) {
            /* write */ set.add(60);
        }
        set.remove(20);
        set.add(50);
        int counter = 0;
        int result = -1;
        /* read */ for (Integer value : set) {
            if (counter == 2) {
                result = value;
                break;
            }
            counter++;
        }
        System.out.println("Value at read point: " + result);
    }
}