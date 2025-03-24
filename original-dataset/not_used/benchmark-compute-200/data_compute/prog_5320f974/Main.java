import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        /* other operations */
        int rand = 1234 * 4321 + 777;
        /* other operations */
        int k = rand % 100;
        /* other operations */
        table.put(1, 100);
        /* other operations */
        table.put(2, 200);
        table.put(3, 300);
        /* misleading modification */
        if (table.containsKey(1)) {
            table.put(10, 500);
        } else {
            table.put(11, 600);
        }
        /* write */ if (k < 50) {
            table.put(2, 42);
        } else {
            table.put(3, 43);
        }
        /* unrelated computations */
        int dummy = table.hashCode() * 2 - 777;
        if (dummy > 1000) {
            dummy += rand;
        }
        /* read */ int ret = table.get(2);
    }
}