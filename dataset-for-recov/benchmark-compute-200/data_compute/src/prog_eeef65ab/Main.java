import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        /* other operations */
        String[] keys = {"one", "two", "three", "four"};
        /* other operations */
        map.put(keys[2], 20);
        /* other operations */
        map.put(keys[0], 10);
        /* other operations */
        map.put(keys[1], 30);
        /* conditional logic and computations */
        int num = 42;
        if (num % 3 == 0) {
            /* misleading write */
            map.put("five", 50);
        } else if (num % 5 == 0) {
            /* misleading write */
            map.put("six", 60);
        } else {
            /* write */ map.put(keys[3], 40);
        }
        /* other operations */
        map.remove("five");
        /* misleading modification */
        map.put("seven", 70);
        /* other operations */
        /* read */ Integer ret = map.get("four");
        System.out.println("Retrieved Value: " + ret);
    }
}
