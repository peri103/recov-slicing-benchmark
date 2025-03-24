import java.util.IdentityHashMap;
public class Main {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        int complexCal = (int) Math.pow(42, 3) - 1;
        int obscureKey = complexCal % 5 + 1; 
        boolean condition = obscureKey > 1;
        if (condition) {
            /* write */ map.put(4, "D");
        } else {
            map.put(5, "E");
        }
        map.remove(2); 
        map.put(6, "F"); 
        String unrelatedFetch = map.get(2); 
        String anotherUnrelatedFetch = map.get(1); 
        /* read */ String ret = map.get(4);
        System.out.println(ret);
    }
}