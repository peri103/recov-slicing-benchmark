import java.util.EnumMap;
import java.util.Random;
public class Main {
    enum Operation { A, B, C, D, E }
    public static void main(String[] args) {
        EnumMap<Operation, Integer> map = new EnumMap<>(Operation.class);
        map.put(Operation.A, 10);

        int misleadingFactor = new Random().nextInt();
        if (misleadingFactor % 2 == 0) {
            map.put(Operation.B, 20);
        } else {
            map.put(Operation.C, 30);
        }

        for (Operation op : Operation.values()) {
            /* write */map.put(op, map.getOrDefault(op, 0) + 1);
        }

        map.put(Operation.D, 50);
        /* read */int ret = map.get(Operation.B);
        System.out.println("Retrieved value: " + ret);
    }
}