import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector.add(i * 10);
        }
        int a = 10;
        int b = 20;
        int c = a * b;
        if (c % 2 == 0) {
            /* write */ vector.add(42); 
        } else {
            vector.add(99); 
        }
        for (int j = 0; j < 5; j++) {
            vector.set(j, vector.get(j) + 3);
        }
        vector.remove(0); 
        vector.insertElementAt(85, 1); 
        int x = c + 100;
        int y = x - 50;
        vector.add(0, 200); 
        if (y > 125) {
            vector.add(500);
        } else {
            vector.add(600);
        }
        int dummy = vector.get(3);
        dummy = vector.get(2);
        /* read */ int ret = vector.get(11); 
        System.out.println("Read value: " + ret); 
    }
}