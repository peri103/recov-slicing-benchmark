import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "three");
        map.put(5, "five");
        /* unrelated operations */
        int x = 10;
        int y = 20;
        int z = x + y;
        boolean condition = (z % 2 == 0);
        if (condition) {
            /* write */ map.put(1, "one");
        } else {
            map.put(2, "two");
        }
        map.put(4, "four");
        map.remove(5);
        map.put(5, "five-reinsert");
        map.put(6, "six");
        String temp = map.get(4);
        /* read */ String ret = map.get(1);
        System.out.println(ret); 
    }
}