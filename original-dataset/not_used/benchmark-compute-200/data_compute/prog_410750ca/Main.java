import java.util.IdentityHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new IdentityHashMap<>();
        map.put(new Integer(1), "A");
        map.put(new Integer(2), "B");
        map.put(new Integer(3), "C");
        map.remove(new Integer(2));
        int complexCalculation = 5 * 3 + 2;
        boolean condition = (complexCalculation % 2 == 0);
        int misleadingVariable = 1024;
        misleadingVariable -= 1000;
        /* write */
        if (condition) {
            map.put(new Integer(2), "Write Point");
        } else {
            map.put(new Integer(3), "Misleading");
        }
        /* unrelated operations */
        map.remove(new Integer(1));
        map.put(new Integer(4), "D");
        map.replace(new Integer(3), "C", "E");
        map.put(new Integer(1), "F");
        misleadingVariable += 12;
        /* intermediate condition without effecting the read */
        if (misleadingVariable > 10) {
            map.put(new Integer(3), "Hidden");
        }
        /* read */ String ret = map.get(2);
        System.out.println(ret);
    }
}