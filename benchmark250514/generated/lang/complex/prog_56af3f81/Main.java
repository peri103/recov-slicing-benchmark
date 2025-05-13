import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Calendar instance and set a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10);
        Date date = calendar.getTime();

        // Use DateUtils to set the year of the date to 2025
        /* write */ Date modifiedDate = DateUtils.setYears(date, 2025);

        // Create an ArrayList and populate it with some dates
        ArrayList<Date> dateList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Calendar cal = Calendar.getInstance();
            cal.set(2023, Calendar.OCTOBER, 10 + i);
            dateList.add(cal.getTime());
        }

        // Perform some operations on the dateList
        for (Date d : dateList) {
            Date truncated = DateUtils.truncate(d, Calendar.DAY_OF_MONTH);
            System.out.println("Truncated Date: " + truncated);
        }

        // Truncate the modified date to the start of the day
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, Calendar.DAY_OF_MONTH);

        // Print the truncated date
        System.out.println("Truncated Modified Date: " + truncatedDate);

        // Create another Calendar instance and modify dates using DateUtils
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.set(2024, Calendar.NOVEMBER, 15);
        Date anotherDate = anotherCalendar.getTime();
        Date yearAdjustedDate = DateUtils.setYears(anotherDate, 2030);

        // Truncate and print the year-adjusted date
        Date finalTruncatedDate = DateUtils.truncate(yearAdjustedDate, Calendar.DAY_OF_MONTH);
        System.out.println("Final Truncated Date: " + finalTruncatedDate);
    }
}