import java.util.TreeSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(15);
        int rand = 1234 * 4321 + 777 + 888 + 999;
        int k = (rand % 10) + 5;
        if (k > 11500) {
            set.add(20);
        } else {
            set.add(25);
        }
        set.remove(15);
        set.add(30);
        if (k % 2 == 1) {
            /* write */ set.add(17);
        } else {
            set.add(18);
        }
        set.add(22);
        set.add(33);
        if (set.contains(33)) {
            set.add(44);
        } else {
            set.add(55);
        }
        /* read */ Integer ret = set.higher(15);
        System.out.println("Read value: " + ret);
    }
}