import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(5, "five");
        int condition = (int) (Math.random() * 100);
        map.put(7, "seven");
        if (condition % 2 == 0) {
            map.put(2, "incorrect");
        } else {
            map.remove(3);
        }
        /* write */ map.put(2, "two");  
        map.put(4, "four");
        map.put(6, "six");
        if (condition < 50) {
            map.replace(5, "five_new");
        } else {
            map.remove(1);
        }
        /* read */ String ret = map.get(2);
        System.out.println("Retrieved value: " + ret);
    }
}