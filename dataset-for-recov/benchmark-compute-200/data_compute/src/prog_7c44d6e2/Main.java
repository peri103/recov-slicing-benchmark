import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        /* other operations */
        int multiplier = 7;
        String placeholder = "Hello, World!";
        /* misleading operation */
        set.add(5);
        set.remove(5);
        set.add(multiplier * 2);
        /* potential write operation */
        set.add(14);
        /* write */
        set.add(10);
        /* other operations */
        if ((placeholder.length() * multiplier) % 3 == 1) {
            set.add(21);
        } else {
            set.add(42);
        }
        /* other operations */
        /* read */
        boolean containsTen = set.contains(10);
        System.out.println("Value found: " + containsTen);
    }
}