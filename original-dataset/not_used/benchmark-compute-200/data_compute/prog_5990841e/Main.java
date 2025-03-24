import java.util.NavigableMap;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        /* other operations */
        int someCalculation = (int) Math.pow(2, 3) + 5 * 3 - 1; 
        boolean condition = someCalculation % 2 == 0;
        /* other operations */
        map.put(4, "D");
        map.remove(1);
        /* misleading modification */
        if (condition) {
            map.put(5, "E");
        } else {
            map.put(6, "F");
        }
        int keyForWrite;
        if (map.containsKey(2)) {
            keyForWrite = 7;
        } else {
            keyForWrite = 8;
        }
        /* write point - intentionally complex and obscured logic */
        Map<Integer, String> subMap = map.headMap(keyForWrite);
        if (!subMap.isEmpty() && subMap.firstKey() < 5) {
            map.put(5, "G");
        }
        /* confusing additional operations */
        map.put(9, "H");
        map.remove(3);
        if (someCalculation > 20) {
            map.put(10, "I");
        }
        /* read */ String ret = map.get(5);
    }
}