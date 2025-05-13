import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilderWrapper strBuilderWrapper = new StrBuilderWrapper();
        DataProcessor dataProcessor = new DataProcessor();

        // Adding numbers to the processor
        for (int i = 0; i < 5; i++) {
            dataProcessor.addNumber(i * 2);
        }

        // Using StrBuilderWrapper to append a separator with initial
        strBuilderWrapper.appendSeparatorWithInitial("first");

        // Adding more elements to the StrBuilderWrapper
        strBuilderWrapper.appendString("second");
        strBuilderWrapper.appendString("third");

        // Processing numbers list
        int sum = dataProcessor.getSumOfNumbers();
        System.out.println("Sum of numbers: " + sum);

        // More operations with StrBuilderWrapper
        strBuilderWrapper.appendFinalString("final");

        // Reading the final result from StrBuilderWrapper
        /* read */ String result = strBuilderWrapper.getFinalString();
        System.out.println(result);

        // Further processing with numbers list
        dataProcessor.updateNumbers(10);

        // Display updated numbers
        for (int num : dataProcessor.getNumbers()) {
            System.out.println("Updated number: " + num);
        }
    }
}