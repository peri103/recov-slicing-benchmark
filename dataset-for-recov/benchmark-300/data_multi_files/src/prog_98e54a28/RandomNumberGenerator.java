import java.util.HashSet;
import java.util.Random;

public class RandomNumberGenerator {
    private Random random = new Random();

    public HashSet<Integer> generateRandomNumbers(int count, int bound) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(bound));
        }
        return numbers;
    }
}
