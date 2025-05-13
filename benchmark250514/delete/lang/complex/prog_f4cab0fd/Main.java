import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Date updatedDate;
        Calendar calendar = Calendar.getInstance();

        // Initialize an ArrayList to store date manipulations
        ArrayList<Date> dateList = new ArrayList<>();

        // Add current date to the list
        dateList.add(date);

        // Manipulate the date using Calendar
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        Date tenDaysLater = calendar.getTime();
        dateList.add(tenDaysLater);

        // Manipulate the date using DateUtils
        /* write */ updatedDate = DateUtils.setYears(date, 2023);

        // Further manipulate dates
        calendar.setTime(updatedDate);
        calendar.add(Calendar.MONTH, 3);
        Date threeMonthsLater = calendar.getTime();
        dateList.add(threeMonthsLater);

        // Print out all manipulated dates
        for (Date d : dateList) {
            System.out.println("Manipulated Date: " + d);
        }

        // Truncate the date using DateUtils
        /* read */ Date truncatedDate = DateUtils.truncate(updatedDate, DateUtils.YEAR);

        System.out.println("Truncated Date: " + truncatedDate);

        // Add more dates to the list
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.DAY_OF_YEAR, 5);
        Date fiveDaysAfterTruncate = calendar.getTime();
        dateList.add(fiveDaysAfterTruncate);

        // Print out all dates in the list
        for (Date d : dateList) {
            System.out.println("Final Date List: " + d);
        }
    }
}