import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize a calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15); // Set to a specific date

        // Convert calendar to date
        Date date = calendar.getTime();

        // Use DateUtils to set weeks (write operation)
        /* write */ date = DateUtils.setWeeks(date, 3);

        // Additional unrelated operations
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.setTime(date);
        anotherCalendar.add(Calendar.DAY_OF_MONTH, 5);
        Date newDate = anotherCalendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Modified Date: " + sdf.format(newDate));

        // More unrelated operations
        Calendar yetAnotherCalendar = Calendar.getInstance();
        yetAnotherCalendar.set(2023, Calendar.DECEMBER, 25);
        Date christmas = yetAnotherCalendar.getTime();
        System.out.println("Christmas Date: " + sdf.format(christmas));

        // Use DateUtils to truncate (read operation)
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.WEEK_OF_YEAR);

        // Print the truncated date
        System.out.println("Truncated Date: " + sdf.format(truncatedDate));

        // Further complexity
        Calendar endOfYear = Calendar.getInstance();
        endOfYear.set(2023, Calendar.DECEMBER, 31);
        Date endDate = endOfYear.getTime();
        System.out.println("End of Year Date: " + sdf.format(endDate));

        // Calculate days between truncated date and end of year
        long diffInMillies = Math.abs(endDate.getTime() - truncatedDate.getTime());
        long diff = diffInMillies / (24 * 60 * 60 * 1000);
        System.out.println("Days between truncated date and end of year: " + diff);
    }
}