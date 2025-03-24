import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        /* write */ map.put(1, "value");
        /* read */ String value = map.get(1);
        System.out.println(value);
    }
}