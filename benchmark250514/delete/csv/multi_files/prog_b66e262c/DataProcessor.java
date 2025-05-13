import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private List<String> names = new ArrayList<>();
    private List<Integer> numbers = new ArrayList<>();

    public DataProcessor() {
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
    }

    public void printNames() {
        for (String name : names) {
            System.out.println("Processing name: " + name);
        }
    }

    public void printNumbers() {
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
}
