import java.util.LinkedHashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        set.remove(5);
        set.add(6);
        set.remove(7);
        set.add(7);
        int mysteryIndex = 0;
        for (Integer num : set) {
            if (num == 2) {
                mysteryIndex = num * 3;
            }
        }
        if (mysteryIndex % 2 == 0) {
            /* write */ set.add(11);
        } else {
            set.add(12);
        }
        set.add(15);
        set.remove(3);
        set.add(14);
        set.remove(14);
        int readIndex = -1;
        for (Iterator<Integer> it = set.iterator(); it.hasNext(); ) {
            readIndex++;
            int val = it.next();
            if (val == 11) break;
        }
        int value = -1, currentIndex = -1;
        for (Integer num : set) {
            currentIndex++;
            if (currentIndex == readIndex) {
                value = num;
                break;
            }
        }
        /* read */ int ret = value;
        System.out.println(ret);
    }
}