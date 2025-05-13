import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize PeriodAxis and RegularTimePeriod
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");
        RegularTimePeriod firstPeriod = new Day(1, 1, 2023);

        // Initialize additional RegularTimePeriod and ArrayList for complexity
        RegularTimePeriod secondPeriod = new Month(2, 2023);
        ArrayList<RegularTimePeriod> periodList = new ArrayList<>();
        
        // Add periods to the ArrayList
        periodList.add(firstPeriod);
        periodList.add(secondPeriod);

        // Perform some operations on the list
        for (RegularTimePeriod period : periodList) {
            System.out.println("Period: " + period);
        }

        // Set the first period in PeriodAxis
        /* write */ periodAxis.setFirst(firstPeriod);

        // Insert additional unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Retrieve the first period from PeriodAxis
        /* read */ RegularTimePeriod readFirstPeriod = periodAxis.getFirst();

        // Print the retrieved period
        System.out.println("First Period: " + readFirstPeriod);

        // More complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Use another PeriodAxis instance
        PeriodAxis anotherPeriodAxis = new PeriodAxis("Another Axis");
        anotherPeriodAxis.setFirst(secondPeriod);
        RegularTimePeriod anotherReadFirstPeriod = anotherPeriodAxis.getFirst();
        System.out.println("Another First Period: " + anotherReadFirstPeriod);
    }
}