import java.util.Random;

public class DataSource {
    private Random random = new Random();

    public int generateData() {
        return random.nextInt(100);
    }
}
