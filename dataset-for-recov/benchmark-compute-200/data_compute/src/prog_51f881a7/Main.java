import java.util.EnumMap;
import java.util.Random;
public class Main {
    enum Operation { A, B, C, D, E }
    public static void main(String[] args) {
        EnumMap<Operation, Integer> map = new EnumMap<>(Operation.class);
        map.put(Operation.A, 10);
        /* other operations */
        int misleadingFactor = new Random().nextInt();
        /* write */ if (misleadingFactor % 2 == 0) {
            map.put(Operation.B, 20);
        } else {
            map.put(Operation.C, 30);
        }
        /* other operations */
        for (Operation op : Operation.values()) {
            map.put(op, map.getOrDefault(op, 0) + 1);
        }
        /* other unrelated operations */
        map.put(Operation.D, 50);
        /* read */ int ret = map.get(Operation.B);
        System.out.println("Retrieved value: " + ret);
    }
}