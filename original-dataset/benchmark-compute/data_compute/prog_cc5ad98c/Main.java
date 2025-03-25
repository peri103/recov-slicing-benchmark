import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(15);
        int result = set.first();
        /* other operations */
        int random1 = 123;
        double random2 = 456.78;
        /* other operations */
        boolean condition = random1 > 100 && random2 < 500.0;
        /* misleading modification */
        random1 = random1 * 2 - 50;
        /* misleading modification */
        set.add(random1 % 10);
        /* misleading modification */
        set.remove(5);
        /* condition affects whether write point executes */
        if (condition) {
            /* write */ set.add(8);
        } else {
            set.add(2);
        }
        /* other operations */
        set.remove(15);
        /* other operations */
        /* read */ result = set.first();
        System.out.println("The result is: " + result);
    }
}
