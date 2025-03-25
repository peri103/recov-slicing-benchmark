import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 5; i++) {
            vector.add(i);
        }
        /* other operations */
        int randomFactor = 42;
        int misleadingIndex = 2;
        vector.set(misleadingIndex, randomFactor);
        /* other operations */
        if (randomFactor > 40) {
            misleadingIndex = 0;
        } else {
            misleadingIndex = 4;
        }
        vector.clear();
        for (int i = 0; i < 4; i++) {
            vector.add(i);
        }
        /* write */ vector.add(10);
        vector.add(3, 99); 
        misleadingIndex = randomFactor % 3; 
        if (misleadingIndex == 2) {
            vector.remove(2);
        } else {
            vector.set(1, 21);
        }
        /* other operations */
        /* read */ int ret = vector.get(4);
        System.out.println("Read value: " + ret);
    }
}
