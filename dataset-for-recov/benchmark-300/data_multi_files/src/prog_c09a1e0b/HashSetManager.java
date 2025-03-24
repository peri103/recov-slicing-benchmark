import java.util.HashSet;
import java.util.Random;

public class HashSetManager {
    private HashSet<Integer> hashSet = new HashSet<>();

    public void addRandomValues(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomValue = random.nextInt(100);
            hashSet.add(randomValue);
        }
    }

    public void printValues() {
        for (Integer value : hashSet) {
            System.out.println("HashSet value: " + value);
        }
    }
}
