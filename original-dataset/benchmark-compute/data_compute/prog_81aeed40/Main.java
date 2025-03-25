import java.util.IdentityHashMap;
public class Main {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        int factors = sumFactors(28); 
        boolean executeWrite = (factors % 3 != 0);
        if (!executeWrite) {
            map.put(4, "four");
            map.remove(3); 
        }
        map.put(5, "five"); 
        if (executeWrite) {
            /* write */ map.put(2, "updated");
        }
        map.put(6, "six");
        /* read */ String ret = map.get(2);
        System.out.println("Value: " + ret);
    }
    private static int sumFactors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
