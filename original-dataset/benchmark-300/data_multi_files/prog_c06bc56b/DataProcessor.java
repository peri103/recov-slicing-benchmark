import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Random;

public class DataProcessor {
    private CopyOnWriteArrayList<Integer> dataList = new CopyOnWriteArrayList<>();

    public void processData() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            dataList.add(random.nextInt(100));
        }

        System.out.println("Initial Data List: " + dataList);

        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i) % 2 == 0) {
                dataList.set(i, dataList.get(i) * 2);
            }
        }

        System.out.println("Processed Data List: " + dataList);
    }
}
