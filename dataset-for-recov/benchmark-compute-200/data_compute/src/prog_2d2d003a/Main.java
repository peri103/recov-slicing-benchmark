import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(0);
        vector.add(1);
        /* write */vector.add(2);
        int seed = (int) (Math.random() * 1000);
        int index = seed % 2 + 1;
        int v = vector.get(index);
        if (v == 0) {
            vector.set(2, 10);
        }
        vector.set(1, 42);
        vector.add(index, misleadingValue + 5);
        if (index != 1) {
            vector.remove(0); 
        }
        /* read */int ret = vector.get(2);
        System.out.println("Retrieved: " + ret);
    }
}