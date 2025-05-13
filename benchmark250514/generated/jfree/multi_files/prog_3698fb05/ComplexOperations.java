import java.util.ArrayList;

public class ComplexOperations {
    public int calculateSum(int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += i;
        }
        return sum;
    }

    public ArrayList<Integer> generateNumbers(int count, int multiplier) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(i * multiplier);
        }
        return numbers;
    }
}
