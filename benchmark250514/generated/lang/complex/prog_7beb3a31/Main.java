import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize calendar to a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15);
        Date date = calendar.getTime();

        // Add some unrelated code to make the program more complex
        List<Date> dateList = new ArrayList<>();
        dateList.add(date);

        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.set(2022, Calendar.DECEMBER, 31);
        Date anotherDate = anotherCalendar.getTime();
        dateList.add(anotherDate);

        for (Date d : dateList) {
            System.out.println("Original date in list: " + d);
        }

        /* write */ date = DateUtils.setDays(date, 25); // Set the day of the month to 25

        // More complex operations
        Date maxDate = DateUtils.addMonths(date, 2);
        Date minDate = DateUtils.addDays(date, -10);

        System.out.println("Max Date after adding months: " + maxDate);
        System.out.println("Min Date after subtracting days: " + minDate);

        Date roundedDate = DateUtils.round(date, Calendar.MONTH);
        System.out.println("Rounded Date to nearest month: " + roundedDate);

        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DAY_OF_MONTH); // Truncate to the start of the day

        System.out.println("Truncated Date: " + truncatedDate);

        // Additional unrelated operations
        for (Date d : dateList) {
            Date updatedDate = DateUtils.addYears(d, 1);
            System.out.println("Updated Date after adding year: " + updatedDate);
        }
    }
}