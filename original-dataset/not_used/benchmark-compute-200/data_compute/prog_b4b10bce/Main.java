import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        int magic = computeMagicNumber();
        /* write */ if (magic % 2 == 0) {
            map.put(3, "Three");
        } else {
            map.put(4, "Four");
        }
        map.put(5, "Five");
        map.remove(2);
        map.put(2, "Deuce");
        String s = "Unrelated";
        if (s.length() > 5) {
            map.put(1, "Uno");
        }
        String randomAccess = map.get(4);
        /* read */ String ret = map.get(3);
        System.out.println("Value at read point: " + ret);
    }
    private static int computeMagicNumber() {
        int x = 7;
        for (int i = 0; i < 5; i++) {
            x *= 2;
        }
        return x;
    }
}