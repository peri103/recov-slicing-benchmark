import java.util.LinkedList;
import java.util.Random;

public class DataProcessor {
    private LinkedList<Integer> list = new LinkedList<>();
    private Random random = new Random();

    public void generateData() {
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }
    }

    public LinkedList<Integer> getList() {
        return list;
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }
}
