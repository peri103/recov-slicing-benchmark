import java.util.EnumMap;
public class Main {
    enum Key {
        ALPHA, BETA, GAMMA, DELTA
    }
    public static void main(String[] args) {
        EnumMap<Key, Integer> map = new EnumMap<>(Key.class);
        map.put(Key.ALPHA, 10);
        map.put(Key.BETA, 20);
        map.put(Key.GAMMA, 30);
        boolean condition = true;
        int misleadingCalculation = 1000 * 42 / 5 + 7;
        /* write */ if (misleadingCalculation % 2 == 0) {
            map.put(Key.DELTA, 40);
        }
        /* other operations */
        map.put(Key.ALPHA, map.get(Key.ALPHA) + 1);
        map.put(Key.BETA, map.get(Key.BETA) - 5);
        if (condition) {
            map.put(Key.GAMMA, 55);
        }
        /* other operations */
        map.remove(Key.ALPHA);
        map.put(Key.ALPHA, 45);
        /* read */ int ret = map.get(Key.DELTA);
        System.out.println("Read value: " + ret);
    }
}