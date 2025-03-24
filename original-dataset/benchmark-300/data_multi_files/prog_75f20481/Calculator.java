import java.util.ArrayList;
import java.util.LinkedList;

public class Calculator {
    private ArrayList<Integer> list = new ArrayList<>();
    private LinkedList<Integer> queue = new LinkedList<>();

    public void initializeData() {
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        for (Integer obj : list) {
            queue.add(obj);
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer obj : queue) {
            sum += obj;
        }
        return sum;
    }

    public int calculateProduct() {
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        return product;
    }
}
