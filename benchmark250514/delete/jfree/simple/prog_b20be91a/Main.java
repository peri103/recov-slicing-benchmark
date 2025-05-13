import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.Period;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");

        // Create a Period object to be set as the last period
        Period lastPeriod = new Period() {
            // Implement necessary methods for the Period class if needed
        };

        /* write */ periodAxis.setLast(lastPeriod);

        /* read */ Period retrievedPeriod = periodAxis.getLast();

        // Assuming the Period class has a meaningful toString method
        System.out.println(retrievedPeriod);
    }
}