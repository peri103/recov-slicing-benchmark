import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("X", 5);
        map.put("Y", 10);
        map.put("Z", 15);
        int temp = map.get("X") + map.get("Y"); 
        if (temp > 10) {
            map.put("A", 100);
        } else {
            map.put("B", 200);
        }
        map.put("M", 50);  
        if (temp > 20) {
            /* write */ map.put("C", 300);
        } else {
            map.put("D", 400);
        }
        map.put("N", 60); 
        /* read */ int ret = map.get("C");
        System.out.println(ret); 
    }
}
