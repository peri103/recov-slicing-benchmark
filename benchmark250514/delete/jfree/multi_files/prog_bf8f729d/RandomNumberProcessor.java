import java.util.Random;

public class RandomNumberProcessor {
    private int[] numbers;
    private Random random;

    public RandomNumberProcessor(int size) {
        numbers = new int[size];
        random = new Random();
        generateNumbers();
    }

    private void generateNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
    }

    public int getSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int getMax() {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int getMin() {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
