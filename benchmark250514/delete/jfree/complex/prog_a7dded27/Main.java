import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a PeriodAxis object
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");
        
        // Create a Day object to use with setLast method
        Day day = new Day(1, 1, 2023); // January 1, 2023
        
        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month(1, 2023)); // January 2023
        months.add(new Month(2, 2023)); // February 2023
        months.add(new Month(3, 2023)); // March 2023

        // Iterate over months and print them
        for (Month month : months) {
            System.out.println("Month: " + month);
        }

        // Additional complex logic: Calculate the total number of days in the months
        int totalDays = 0;
        for (Month month : months) {
            totalDays += month.getLastDay().getDayOfMonth();
        }
        System.out.println("Total Days in Months: " + totalDays);

        /* write */ periodAxis.setLast(day);
        
        // Additional unrelated logic: Work with Year objects
        Year year = new Year(2023);
        System.out.println("Year: " + year);
        System.out.println("Is Leap Year: " + year.isLeapYear());

        // More complex logic: Calculate the number of months in the year
        int numberOfMonths = year.getMonths().length;
        System.out.println("Number of Months in Year: " + numberOfMonths);

        /* read */ Day lastDay = (Day) periodAxis.getLast();
        
        // Print the result to verify
        System.out.println("Last Day: " + lastDay);
    }
}