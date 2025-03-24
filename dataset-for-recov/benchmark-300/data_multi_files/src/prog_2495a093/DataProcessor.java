import java.util.Random;

public class DataProcessor {
    private Random random = new Random();

    public int generateRandomNumber() {
        return random.nextInt(100);
    }

    public void processData(int data) {
        System.out.println("Processing data: " + data);
    }
}
