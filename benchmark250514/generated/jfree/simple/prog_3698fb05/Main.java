import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");
        RegularTimePeriod firstPeriod = new Day(1, 1, 2023);

        /* write */ periodAxis.setFirst(firstPeriod);
        /* read */ RegularTimePeriod readFirstPeriod = periodAxis.getFirst();

        System.out.println("First Period: " + readFirstPeriod);
    }
}