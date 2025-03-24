import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        int rand = (int) (Math.random() * 100);
        int x = rand * 2;
        int k = x % vector.size();
        if (rand % 2 == 0) {
            /* write */ vector.set(1, rand + 5);
        } else {
            vector.set(1, 50);
        }
        vector.set(0, vector.get(0) + 5);
        vector.remove(2);
        vector.add(40);
        /* read */ int ret = vector.get(1);
        System.out.println("Retrieved value: " + ret);
    }
}