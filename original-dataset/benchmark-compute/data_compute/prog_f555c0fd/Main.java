import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        /* other operations */
        int rand1 = 123;
        int rand2 = 456;
        int temp = rand1 + rand2 * 2;
        /* misleading operations that do not affect read point */
        for (int i = 0; i < 5; i++) {
            map.put(i, i * i);
        }
        /* other operations with the same API as the read point */
        map.get(0);
        map.get(4);
        /* complex conditional logic */
        if (temp % 2 == 0) {
            /* write */ map.put(1, 99); 
        } else {
            map.put(1, 50);
        }
        /* unrelated write operations */
        map.put(2, 100);
        map.put(3, 200);
        /* read */ int ret = map.get(1);
        System.out.println("The retrieved value is " + ret);
    }
}