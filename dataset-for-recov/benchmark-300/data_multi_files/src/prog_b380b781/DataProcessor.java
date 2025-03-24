import java.util.Random;

public class DataProcessor {
    private Random random = new Random();

    public int generateRandomValue() {
        return random.nextInt(100);
    }

    public void processValue(int value) {
        System.out.println("Processing value: " + value);
    }
}
