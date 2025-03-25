import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(0); 
        list.add(1);
        int a = 5, b = 10;
        int resultA = computeSomething(a);
        int resultB = computeSomethingElse(b);
        boolean shouldWrite = (resultA + resultB) % 2 == 0;
        /* misleading write */
        for (int i = 0; i < 3; i++) {
            list.add(i + 3);
        }
        if (shouldWrite) {
            list.add(42); 
        }
        /* obfuscating computations */
        if (resultA < resultB) {
            /* write */ list.set(1, 99);
        }
        list.removeLast(); 
        list.add(3, 8); 
        list.add(4, 9); 
        /* read */ int ret = list.get(1);
        System.out.println("The retrieved value is: " + ret);
    }
    private static int computeSomething(int value) {
        return value * value + 2 * value + 1;
    }
    private static int computeSomethingElse(int value) {
        return value - 3 + value / 3;
    }
}
