import org.jfree.data.time.Day;
import org.jfree.data.time.RegularTimePeriod;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize TimePeriodManager and ComplexOperations
        TimePeriodManager timePeriodManager = new TimePeriodManager("Demo Axis");
        ComplexOperations complexOps = new ComplexOperations();

        // Set the first period in TimePeriodManager
        RegularTimePeriod firstPeriod = new Day(1, 1, 2023);
        timePeriodManager.setFirstPeriod(firstPeriod);

        // Perform some complex operations
        int sum = complexOps.calculateSum(10);
        System.out.println("Sum of first 10 numbers: " + sum);

        ArrayList<Integer> numbers = complexOps.generateNumbers(5, 10);
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Retrieve and print the first period from TimePeriodManager
        /* read */ RegularTimePeriod readFirstPeriod = timePeriodManager.getFirstPeriod();
        System.out.println("First Period: " + readFirstPeriod);
    }
}