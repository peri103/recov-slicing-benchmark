import java.util.EnumMap;
public class Main {
    enum Key {
        ONE, TWO, THREE, FOUR
    }
    public static void main(String[] args) {
        EnumMap<Key, Integer> map = new EnumMap<>(Key.class);
        map.put(Key.ONE, 10);
        map.put(Key.TWO, 20);
        map.put(Key.THREE, 30);
        int a = 5 * 3 + 2;
        boolean condition = (a % 2 == 0);
        if (condition) {
            map.put(Key.FOUR, 40);
        } else {
            /* write */ map.put(Key.THREE, 100);
        }
        int x = map.get(Key.ONE);
        int y = map.get(Key.TWO);
        map.put(Key.TWO, x + y);
        map.put(Key.ONE, x * y);
        /* read */ int ret = map.get(Key.THREE);
        System.out.println("Retrieved value: " + ret);  
    }
}
