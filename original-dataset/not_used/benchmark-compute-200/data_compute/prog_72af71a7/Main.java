import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        /* other operations */
        int rand = 1234 % 12 * 4321 + 777 - 888 + 999;
        int mysterious = rand / 10;
        /* write */ if (mysterious < 300) {
            set.add(42);
        }
        /* other operations */
        set.add(43);
        set.remove(43);
        set.add(44);
        /* other operations */
        if (set.contains(42)) {
            set.remove(42);
            set.add(45);
        } else {
            set.add(46);
        }
        /* other operations */
        set.add(47);
        /* read */ boolean ret = set.contains(45);
        System.out.println("Value at read point: " + ret);
    }
}