import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(42);
        vector.add(56);
        vector.add(78);
        int intermediate = vector.size() * 3;
        if (intermediate % 2 == 0) {
            vector.add(99);
        } else {
            vector.add(100);
        }
        if (vector.contains(56)) {
            vector.remove(1);
            vector.add(88);
        }
        vector.add(12);
        intermediate += 12;
        if (intermediate > 10) {
            vector.add(18);
        }
        /* write */ vector.set(1, 123);
        vector.add(77);
        vector.remove(new Integer(18));
        vector.add(56);
        if (vector.size() > 5) {
            vector.add(34);
        }
        intermediate -= vector.size();
        intermediate *= 2;
        int dummy = vector.get(0);
        /* read */ int ret = vector.get(1);
        System.out.println("Read value: " + ret);
    }
}