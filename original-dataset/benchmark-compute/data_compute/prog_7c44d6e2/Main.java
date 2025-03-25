import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int multiplier = 7;
        String placeholder = "Hello, World!";

        set.add(5);
        set.remove(5);
        set.add(multiplier * 2);

        set.add(14);
        /* write */
        set.add(10);

        if ((placeholder.length() * multiplier) % 3 == 1) {
            set.add(21);
        } else {
            set.add(42);
        }

        /* read */
        boolean containsTen = set.contains(10);
        System.out.println("Value found: " + containsTen);
    }
}