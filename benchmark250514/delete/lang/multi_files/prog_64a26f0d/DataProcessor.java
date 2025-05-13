import java.util.ArrayList;

public class DataProcessor {
    private ArrayList<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int getSumOfNumbers() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public void updateNumbers(int increment) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + increment);
        }
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
