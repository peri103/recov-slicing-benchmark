import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        /* other operations */
        int rand = 5678 * 8765 + 4444 + 5555 + 6666;
        /* other operations */
        int factor = (rand % 10 + 5) * 3;
        /* other operations */
        if (factor % 3 == 0) {
            set.add(10);
        }
        /* other operations */
        if (factor % 2 == 0) {
            set.add(5);
        } else {
            /* write */ set.add(15);
        }
        /* misleading operations */
        if (set.contains(10)) {
            set.add(20);
        }
        set.add(25);
        set.remove(20);
        if (!set.contains(15)) {
            set.add(30);
        }
        /* read */ boolean exists = set.contains(15);
        System.out.println("Element 15 exists: " + exists);
    }
}