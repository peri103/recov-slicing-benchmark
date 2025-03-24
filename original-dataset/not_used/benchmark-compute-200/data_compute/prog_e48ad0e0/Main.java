import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(5, "five");
        map.put(10, "ten");
        map.put(15, "fifteen");
        int x = 24;
        int y = 42;
        /* write */ map.put(20, "twenty");
        if (x * y % 3 == 0) {
            map.put(25, "twenty-five");
        } else {
            map.remove(5);
        }
        map.remove(10);
        map.put(5, "dodge"); 
        if (map.containsKey(15)) {
            map.remove(15);
            map.put(30, "thirty");
        } else {
            map.put(10, "ten again");
        }
        /* read */ String ret = map.get(20);
    }
}
