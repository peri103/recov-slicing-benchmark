import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 100);  
        map.put("b", 200);
        map.put("c", 300);
        /* misleading modifications */
        map.put("d", 400);
        map.remove("a");
        map.put("e", 500);
        map.remove("e");
        int unused = map.get("b"); 
        String key = "writeKey";
        boolean flag = true;
        if (flag) {
            map.put(key, 999); 
        } else {
            map.put("a", 1000); 
        }
        /* write */ map.put("target", 789);
        map.replace("f", 600); 
        /* read */ int ret = map.get("target");
    }
}