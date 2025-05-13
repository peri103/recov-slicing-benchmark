import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.RegularTimePeriod;

public class Main {
    public static void main(String[] args) {
        PeriodAxis periodAxis = new PeriodAxis("Example Axis");
        
        // Create a RegularTimePeriod instance to use with the setLast method
        RegularTimePeriod lastPeriod = new Day(1, 1, 2023);
        
        /* write */ periodAxis.setLast(lastPeriod);
        
        /* read */ RegularTimePeriod retrievedLast = periodAxis.getLast();
        
        System.out.println("Last period set: " + retrievedLast);
    }
}