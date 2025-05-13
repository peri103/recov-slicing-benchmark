import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Demo Axis");
        
        // Create a Day object to set as the first period
        Day firstDay = new Day(1, 1, 2023); // January 1, 2023
        
        // Write: Set the first period using setFirst method
        /* write */ periodAxis.setFirst(firstDay);

        // Additional code to make the program more complex
        List<Month> months = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            months.add(new Month(i, 2023));
        }
        
        Year currentYear = new Year(2023);
        System.out.println("Year: " + currentYear);

        for (Month month : months) {
            System.out.println("Month: " + month);
        }
        
        Day anotherDay = new Day(15, 6, 2023);
        System.out.println("Another Day: " + anotherDay);

        // Complex operation with periods
        Day midYearDay = new Day(1, 7, 2023);
        periodAxis.setFirst(midYearDay);
        System.out.println("Mid-Year Day: " + midYearDay);

        // Read: Retrieve the first period using getFirst method
        /* read */ Day retrievedFirstDay = (Day) periodAxis.getFirst();
        
        // Output the result
        System.out.println("First period: " + retrievedFirstDay);
    }
}