import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            vector.add(i);
        }
        int choice = (sum % 3 == 0) ? 10 : 20;
        /* other operations */
        for (int i = 0; i < choice; i++) {
            vector.add(i + 100);
        }
        int randomIndex = 3;
        vector.add(1, 777);
        /* misleading operations */
        if (vector.size() > 15) {
            vector.set(0, 888);
        }
        vector.removeElementAt(randomIndex + 5);
        vector.add(randomIndex, 999);
        int temp = (int)Math.pow(2, 5);
        vector.removeAllElements();
        for (int i = 0; i < temp; i++) {
            /* write */ vector.add(i * 3);
        }
        /* read */ int ret = vector.get(1);
        System.out.println("Read value: " + ret);
    }
}
