import java.util.HashSet;
import java.util.Random;

public class NumberProcessor {
    private HashSet<Integer> hashSet = new HashSet<>();
    private Random random = new Random();

    public void generateRandomNumbers(int count) {
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100);
            hashSet.add(randomNumber);
        }
    }

    public HashSet<Integer> getHashSet() {
        return hashSet;
    }
}
