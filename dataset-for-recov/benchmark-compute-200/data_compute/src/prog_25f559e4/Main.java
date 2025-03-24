import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        int seed = 5;
        for (int i = 0; i < 3; i++) {
            vector.add(seed * i);
        }
        int index = vector.size() % 3; 
        int shift = seed << 1;
        vector.remove(index);
        vector.add(index, shift);
        boolean flag = (vector.elementAt(index) > 10);
        vector.add(index, 100);
        if (flag) {
            /* write */ vector.add(index + 1, 99);
        }
        vector.set(0, 111);
        vector.set(1, 222);
        for (int i = vector.size() - 1; i >= 0; i--) {
            vector.add(vector.firstElement() + i);
        }
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += vector.get(i);
        }
        vector.add(400);
        /* read */ int ret = vector.get(index + 1);
        System.out.println("Read value: " + ret);
    }
}