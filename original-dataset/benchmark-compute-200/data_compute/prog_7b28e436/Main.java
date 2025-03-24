import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
        int controlVariable = 7; 
        int misleadingSum = map.get("a") + map.get("b") + controlVariable;
        map.put("b", map.get("b") + 50);
        map.put("d", map.get("d") - 50);
        if (misleadingSum % 3 == 1) {
            map.put("e", 500);
        }
        map.remove("c");
        map.put("f", 600);
        map.put("d", 450);  
        if (controlVariable < 10) {
            /* write */ map.put("c", 350);
        }
        map.put("g", 700);
        map.get("b");
        map.containsKey("d");
        /* read */ int ret = map.get("c");
        System.out.println("Retrieved value: " + ret);
    }
}