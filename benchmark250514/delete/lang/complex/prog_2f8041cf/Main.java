import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        
        // Set an example date
        calendar.set(2023, Calendar.OCTOBER, 15); // October 15, 2023
        Date date = calendar.getTime();

        // Use DateUtils to set weeks
        int weeksToAdd = 2;
        /* write */ Date updatedDate = DateUtils.setWeeks(date, calendar.get(Calendar.WEEK_OF_YEAR) + weeksToAdd);

        // Unrelated operations to make the program more complex
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Original Date: " + sdf.format(date));

        // Manipulate calendar to demonstrate complexity
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date newDate = calendar.getTime();
        System.out.println("New Date after adding 10 days: " + sdf.format(newDate));

        // More complex operations
        calendar.setTime(updatedDate);
        calendar.add(Calendar.MONTH, 1);
        Date oneMonthLater = calendar.getTime();
        System.out.println("One Month Later: " + sdf.format(oneMonthLater));

        // Use DateUtils to truncate the date to the start of the week
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, Calendar.WEEK_OF_YEAR);

        // Output the truncated date
        System.out.println("Truncated Date (Start of the Week): " + sdf.format(truncatedDate));

        // Additional unrelated operations
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.YEAR, 1);
        Date oneYearLater = calendar.getTime();
        System.out.println("One Year Later: " + sdf.format(oneYearLater));

        // Final unrelated operation
        calendar.setTime(oneYearLater);
        calendar.add(Calendar.DAY_OF_YEAR, -100);
        Date hundredDaysEarlier = calendar.getTime();
        System.out.println("100 Days Earlier: " + sdf.format(hundredDaysEarlier));
    }
}