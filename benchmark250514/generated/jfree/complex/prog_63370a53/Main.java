import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.chart.axis.NumberAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");

        // Create a Day object to set as the last period
        Day lastPeriod = new Day(1, 1, 2023);

        // Initialize a NumberAxis object for additional complexity
        NumberAxis numberAxis = new NumberAxis("Number Axis");

        // Create an ArrayList to store some values
        ArrayList<Integer> values = new ArrayList<>();

        // Add some values to the ArrayList
        for (int i = 0; i < 10; i++) {
            values.add(i * 5);
        }

        // Perform some operations on NumberAxis
        numberAxis.setRange(0, 100);
        numberAxis.setTickUnit(new org.jfree.chart.axis.NumberTickUnit(10));

        // Write the last period using setLast method
        /* write */ periodAxis.setLast(lastPeriod);

        // Perform operations on the ArrayList
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        // Read the last period using getLast method
        /* read */ Day readLastPeriod = (Day) periodAxis.getLast();

        // Print the read value
        System.out.println("Last period: " + readLastPeriod);

        // Perform more operations to increase complexity
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) % 2 == 0) {
                System.out.println("Even value: " + values.get(i));
            }
        }
    }
}