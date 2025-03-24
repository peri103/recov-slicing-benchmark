import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProcessor {
    private List<Integer> numbers = new ArrayList<>();
    private Random random = new Random();

    public void generateNumbers(int count) {
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(100));
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
