import java.util.ArrayList;

public class NumberOperations {
    private ArrayList<Integer> numbers = new ArrayList<>();

    public void addNumbers(int count) {
        for (int i = 0; i < count; i++) {
            numbers.add(i * 2);
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int findMax() {
        int max = Integer.MIN_VALUE;
        for (Integer num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
