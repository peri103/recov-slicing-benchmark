import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}
