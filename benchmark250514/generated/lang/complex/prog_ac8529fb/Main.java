import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();
        
        // Round the date to the nearest minute
        /* write */ Date roundedDate = DateUtils.round(date, Calendar.MINUTE);

        // Unrelated complex logic using ArrayList
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(date);
        dateList.add(roundedDate);
        for (int i = 0; i < 5; i++) {
            Date newDate = DateUtils.addMinutes(date, i * 10);
            dateList.add(newDate);
        }

        // Perform some operations on the list
        for (Date d : dateList) {
            System.out.println("Date in list: " + d);
        }

        // More complex logic
        Date latestDate = dateList.get(0);
        for (Date d : dateList) {
            if (d.after(latestDate)) {
                latestDate = d;
            }
        }
        System.out.println("Latest Date: " + latestDate);

        // Truncate the rounded date to the minute
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.MINUTE);

        // Print the results
        System.out.println("Original Date: " + date);
        System.out.println("Rounded Date: " + roundedDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // Additional operations
        Date earliestDate = dateList.get(0);
        for (Date d : dateList) {
            if (d.before(earliestDate)) {
                earliestDate = d;
            }
        }
        System.out.println("Earliest Date: " + earliestDate);
    }
}