public class Main {
    public static void main(String[] args) {
        StrBuilderWrapper strBuilderWrapper = new StrBuilderWrapper();
        ComplexOperations complexOperations = new ComplexOperations();

        // Perform write operation
        strBuilderWrapper.appendSeparatorAndText(",", "Hello");
        strBuilderWrapper.appendSeparatorAndText(",", "World");

        // Perform complex operations
        int sum = complexOperations.calculateSum(0, 9);
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        int product = complexOperations.calculateProduct(1, 5);
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Perform read operation
        /* read */ String result = strBuilderWrapper.getContent();
        System.out.println("StrBuilder content: " + result);
    }
}