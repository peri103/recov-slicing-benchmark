import java.util.HashSet;
import java.util.Random;

public class HashSetOperations {
    private HashSet<Integer> hashSet = new HashSet<>();
    private Random random = new Random();

    public void generateRandomValues(int count) {
        for (int i = 0; i < count; i++) {
            int randomValue = random.nextInt(100);
            hashSet.add(randomValue);
        }
    }

    public HashSet<Integer> getHashSet() {
        return hashSet;
    }
}
