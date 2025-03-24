import java.util.EnumMap;
public class Main {
    public enum Key {
        A, B, C, D
    }
    public static void main(String[] args) {
        EnumMap<Key, Integer> map = new EnumMap<>(Key.class);
        map.put(Key.C, 30);
        map.put(Key.A, 10);
        int controlValue = (int) (Math.random() * 10);
        boolean shouldWrite = controlValue % 3 == 0;
        if (shouldWrite) {
            /* write */ map.put(Key.B, 20);
        } else {
            map.put(Key.D, 40);
        }
        map.put(Key.A, map.get(Key.A) + 5);
        map.put(Key.C, map.getOrDefault(Key.D, 0) + 15);
        controlValue = controlValue * 2;
        int unusedRead = map.getOrDefault(Key.D, 0);
        /* read */ int ret = map.getOrDefault(Key.B, 0);
        System.out.println("Read value: " + ret);
    }
}