import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        ArrayList<Date> dateList = new ArrayList<>();
        
        // Add hours to the current date
        /* write */ Date modifiedDate = DateUtils.addHours(date, 5);

        // Add modified date to the list
        dateList.add(modifiedDate);

        // Perform some unrelated operations with the Date list
        for (int i = 0; i < 3; i++) {
            Date newDate = DateUtils.addDays(modifiedDate, i);
            dateList.add(newDate);
        }

        // Print all dates in the list
        for (Date d : dateList) {
            System.out.println("Date in list: " + d);
        }

        // Truncate the date to remove minutes and seconds
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, Calendar.HOUR);

        System.out.println("Original Date: " + date);
        System.out.println("Modified Date: " + modifiedDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // Additional unrelated operations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.MONTH, 2);
        Date futureDate = calendar.getTime();

        System.out.println("Future Date: " + futureDate);

        // More operations with DateUtils
        Date roundedDate = DateUtils.round(futureDate, Calendar.DAY_OF_MONTH);
        System.out.println("Rounded Date: " + roundedDate);
    }
}