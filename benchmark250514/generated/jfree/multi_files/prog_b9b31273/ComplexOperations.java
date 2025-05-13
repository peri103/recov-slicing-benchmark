import java.util.ArrayList;

public class ComplexOperations {
    private ArrayList<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int computeSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int computeProduct() {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
}
