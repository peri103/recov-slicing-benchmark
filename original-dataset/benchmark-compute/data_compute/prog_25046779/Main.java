import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        /* Complex logic */
        int mysteryNumber = 42;
        boolean condition = ((mysteryNumber * 37) % 3 == 0);
        if (condition) {
            vector.add(5); 
        }
        vector.add(25); 
        int dummy = vector.get(2) * 10;
        dummy += mysteryNumber;
        /* write */ if (mysteryNumber % 2 == 0) {
            vector.set(1, 99);  
        } else {
            vector.add(100); 
        }
        vector.add(35); 
        for (int i = 0; i < vector.size(); i++) {
            dummy += vector.get(i);
        }
        /* read */ int ret = vector.get(1);
        System.out.println("Retrieved value: " + ret);
    }
}
