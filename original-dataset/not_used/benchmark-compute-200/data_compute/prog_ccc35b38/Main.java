import java.util.Map;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(10, "ten");
        map.put(20, "twenty");
        map.put(30, "thirty");
        int unknown = 3 * 3 + 4 / 2; 
        boolean condition = (unknown % 3 == 0);
        /* write */ if (condition) {
            map.put(15, "fifteen");
        } else {
            map.put(25, "twenty-five");
        }
        map.remove(10); 
        map.put(35, "thirty-five");
        map.put(5, "five");
        map.get(20); 
        String misleadingValue = map.get(unknown); 
        /* read */ String ret = map.get(15);
        System.out.println(ret);
    }
}
