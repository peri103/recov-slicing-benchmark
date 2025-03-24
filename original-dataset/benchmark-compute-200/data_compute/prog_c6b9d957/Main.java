import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        int bitmap = 0xABCD;
        int index = calculateIndex(bitmap);
        map.put(index, "Random");
        if (bitmap % 2 == 0) {
            map.put(10, "Ten");
        } else {
            /* write */ map.put(4, "Four");
        }
        randomManipulation(map);
        /* read */ String ret = map.get(4);
        System.out.println(ret);
    }
    private static int calculateIndex(int value) {
        return (value & 0xFFF) >> 1;
    }
    private static void randomManipulation(LinkedHashMap<Integer, String> map) {
        map.put(5, "Five");
        if (map.containsKey(5)) {
            map.remove(1);
            map.put(2, "Dos");
        }
        map.put(6, "Six");
    }
}