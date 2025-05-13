import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;

public class Main {
    public static void main(String[] args) {
        // Initialize the PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Period Axis");
        
        // Create a Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023); // January 1, 2023
        
        // Create additional time periods
        Month firstMonth = new Month(1, 2023);
        Year firstYear = new Year(2023);
        
        // Set the first period using the Day object
        /* write */ periodAxis.setFirst(firstDay);
        
        // Perform unrelated operations
        PeriodAxis monthAxis = new PeriodAxis("Month Axis");
        monthAxis.setFirst(firstMonth);
        
        PeriodAxis yearAxis = new PeriodAxis("Year Axis");
        yearAxis.setFirst(firstYear);
        
        // Create a complex data structure to store periods
        PeriodAxis[] periodArray = new PeriodAxis[3];
        periodArray[0] = periodAxis;
        periodArray[1] = monthAxis;
        periodArray[2] = yearAxis;
        
        // Process each period
        for (PeriodAxis axis : periodArray) {
            System.out.println("Processing axis: " + axis.getLabel());
        }
        
        // Retrieve the first period from the original axis
        /* read */ Day firstPeriod = (Day) periodAxis.getFirst();
        
        // Output the first period to verify
        System.out.println("First period: " + firstPeriod);
        
        // Additional processing
        for (int i = 0; i < periodArray.length; i++) {
            System.out.println("Axis " + i + " label: " + periodArray[i].getLabel());
        }
    }
}