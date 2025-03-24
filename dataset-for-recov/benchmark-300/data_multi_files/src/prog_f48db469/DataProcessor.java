import java.util.HashSet;
import java.util.Random;

public class DataProcessor {
    private HashSet<Integer> hashSet = new HashSet<>();
    private Random random = new Random();

    public void generateRandomValues() {
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            hashSet.add(randomValue);
        }
    }

    public void printHashSetValues() {
        for (Integer value : hashSet) {
            System.out.println("HashSet value: " + value);
        }
    }
}
