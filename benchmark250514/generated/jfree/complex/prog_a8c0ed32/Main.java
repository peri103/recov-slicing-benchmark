import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");

        // Create a RegularTimePeriod instance to use with the write and read methods
        RegularTimePeriod period = new Day(1, 1, 2023);

        // Use the write method to set the first period
        /* write */ periodAxis.setFirst(period);

        // Create another PeriodAxis object for more complexity
        PeriodAxis anotherPeriodAxis = new PeriodAxis("Another Axis");
        RegularTimePeriod anotherPeriod = new Month(1, 2023);
        anotherPeriodAxis.setFirst(anotherPeriod);

        // Create an ArrayList to store some RegularTimePeriod objects
        ArrayList<RegularTimePeriod> periodList = new ArrayList<>();
        periodList.add(period);
        periodList.add(anotherPeriod);

        // Perform operations on the periodList
        for (RegularTimePeriod p : periodList) {
            System.out.println("Period: " + p);
        }

        // Use the read method to get the first period
        /* read */ RegularTimePeriod firstPeriod = periodAxis.getFirst();

        // Print the result to verify that the read method retrieves the value written by the write method
        System.out.println("First period from periodAxis: " + firstPeriod);

        // Perform additional operations on anotherPeriodAxis
        RegularTimePeriod retrievedPeriod = anotherPeriodAxis.getFirst();
        System.out.println("First period from anotherPeriodAxis: " + retrievedPeriod);

        // Create more RegularTimePeriod instances and manipulate them
        RegularTimePeriod period3 = new Day(15, 1, 2023);
        RegularTimePeriod period4 = new Day(20, 1, 2023);
        periodList.add(period3);
        periodList.add(period4);

        for (RegularTimePeriod p : periodList) {
            System.out.println("Updated Period List: " + p);
        }
    }
}