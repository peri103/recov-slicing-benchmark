import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector.add(i * i);
        }
        int x = complexCalculation();
        if (x % 2 == 0) {
            vector.add(100);
        } else {
            /* write */vector.add(200);
        }
        vector.add(300);
        if (vector.size() > 5) {
            vector.set(5, vector.get(5) * 2);
        }
        int dummy = vector.get(3);
        dummy *= 10;
        vector.add(42);
        vector.remove(2);
        vector.set(1, vector.get(1) + 5);
        vector.add(500);
        /* read */int ret = vector.get(10);
        System.out.println("Retrieved value: " + ret);
    }
    private static int complexCalculation() {
        return (int) (Math.random() * 100) + 1;
    }
}