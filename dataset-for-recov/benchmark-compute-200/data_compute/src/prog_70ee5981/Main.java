import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        /* other operations */
        int hash = set.hashCode() * 2;
        /* intermediate unimportant operations */
        for (int i = 0; i < 5; i++) {
            set.add(i * 10);
        }
        /* misleading modifications */
        int unused = (set.hashCode() + 1000) / 5;
        /* conditional logic */
        if (hash % 10 == 0) {
            /* misleading write */
            set.add(99);
        } else {
            set.add(45);
        }
        /* write */
        if (hash % 4 == 0) {
            set.add(50);
        }
        /* other operations that do not affect the read point */
        set.remove(20);
        set.add(60);
        /* read */ int ret = -1;
        int counter = 0;
        for (Integer num : set) {
            if (counter == 4) {
                ret = num;
                break;
            }
            counter++;
        }
        System.out.println("Retrieved value: " + ret);
    }
}