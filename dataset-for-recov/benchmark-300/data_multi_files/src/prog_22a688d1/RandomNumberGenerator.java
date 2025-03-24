import java.util.Random;

public class RandomNumberGenerator {
    private Random random = new Random();

    public int generateRandomNumber() {
        return random.nextInt(100);
    }
}
