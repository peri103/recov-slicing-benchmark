import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PeriodAxis periodAxis = new PeriodAxis("Example Axis");
        
        // Create a RegularTimePeriod instance to use with the setLast method
        RegularTimePeriod lastPeriod = new Day(1, 1, 2023);
        
        /* write */ periodAxis.setLast(lastPeriod);
        
        // Additional complex code
        ArrayList<RegularTimePeriod> periodsList = new ArrayList<>();
        periodsList.add(new Month(1, 2023));
        periodsList.add(new Year(2023));

        for (RegularTimePeriod period : periodsList) {
            System.out.println("Period: " + period);
        }

        // Adding more complexity with calculations
        int totalDays = 0;
        for (RegularTimePeriod period : periodsList) {
            totalDays += period.getLastMillisecond() - period.getFirstMillisecond();
        }
        System.out.println("Total Days Calculated: " + totalDays);

        // Introducing a new PeriodAxis for different operations
        PeriodAxis anotherAxis = new PeriodAxis("Another Axis");
        anotherAxis.setFirst(new Day(1, 1, 2022));
        RegularTimePeriod firstPeriod = anotherAxis.getFirst();
        System.out.println("First period of another axis: " + firstPeriod);

        /* read */ RegularTimePeriod retrievedLast = periodAxis.getLast();
        
        System.out.println("Last period set: " + retrievedLast);
        
        // Further operations using the retrieved value
        if (retrievedLast.equals(lastPeriod)) {
            System.out.println("The retrieved last period matches the set last period.");
        } else {
            System.out.println("The retrieved last period does not match.");
        }
    }
}