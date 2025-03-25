import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        /* Initial operations */
        map.put(0, 10);
        map.put(1, 20);
        int complexCalculation = (int)(Math.pow(23, 2) + Math.sin(2.0) * 50);
        /* Misleading write */
        map.put(2, complexCalculation);
        /* Intermediate operations */
        for (int i = 0; i < 5; i++) {
            map.put(i + 3, i * 10);
        }
        /* write */ map.put(1, 99);
        /* More intermediate operations */
        if (complexCalculation % 2 == 0) {
            map.put(4, 100);
        } else {
            map.put(5, 200);
        }
        /* Misleading read */
        int misleading = map.get(6);
        if (map.contains(4) || map.containsValue(50)) {
            map.put(7, 300);
        }
        /* read */ int ret = map.get(1);
        System.out.println("Read value: " + ret);
    }
}
