import java.util.Random;

public class DataGenerator {
    private Random random = new Random();

    public int generateRandomData() {
        return random.nextInt(100);
    }
}
