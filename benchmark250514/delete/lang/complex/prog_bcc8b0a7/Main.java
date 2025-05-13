import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 1); // Set to October 1, 2023
        Date date = calendar.getTime();

        // Use DateUtils to set weeks
        /* write */ date = DateUtils.setWeeks(date, 5);

        // Additional unrelated operations
        List<Date> dateList = new ArrayList<>();
        dateList.add(date);
        Date anotherDate = DateUtils.addDays(date, 10);
        dateList.add(anotherDate);

        for (Date d : dateList) {
            System.out.println("Date in list: " + d);
        }

        // More complex operations with dates
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, Calendar.NOVEMBER, 15);
        Date anotherDate2 = cal2.getTime();
        Date roundedDate = DateUtils.round(anotherDate2, Calendar.MONTH);
        System.out.println("Rounded Date: " + roundedDate);

        // Use DateUtils to truncate the date to the start of the week
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.WEEK_OF_YEAR);

        // Print the result
        System.out.println("Truncated Date: " + truncatedDate);

        // Additional manipulation and printing
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date modifiedDate = calendar.getTime();
        System.out.println("Modified Date: " + modifiedDate);

        DateUtils.addMonths(modifiedDate, 2);
        System.out.println("Final Date: " + modifiedDate);
    }
}