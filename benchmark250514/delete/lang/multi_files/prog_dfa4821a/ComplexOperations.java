public class ComplexOperations {
    public int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public int calculateProduct(int start, int end) {
        int product = 1;
        for (int i = start; i <= end; i++) {
            product *= i;
        }
        return product;
    }
}
