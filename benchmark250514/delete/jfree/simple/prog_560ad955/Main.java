import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.RegularTimePeriod;

public class Main {
    public static void main(String[] args) {
        // Assuming RegularTimePeriod is a valid class and can be instantiated or has a subclass that can be used.
        // Since RegularTimePeriod is abstract, we'll use a concrete subclass for demonstration.
        RegularTimePeriod period = new RegularTimePeriod() {
            // Implement abstract methods here if necessary
        };

        PeriodAxis axis = new PeriodAxis("Sample Axis");
        /* write */ axis.setLast(period);
        /* read */ RegularTimePeriod lastPeriod = axis.getLast();
        System.out.println(lastPeriod);
    }
}