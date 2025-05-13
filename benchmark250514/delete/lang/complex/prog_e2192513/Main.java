import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();

        // Create a Calendar object
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Set some random fields in the calendar
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        // Convert back to Date
        date = calendar.getTime();

        // Set seconds to 0 using DateUtils.setSeconds
        /* write */ date = DateUtils.setSeconds(date, 0);

        // Create a list of dates
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(date);

        // Add more dates to the list
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        dateList.add(calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 1);
        dateList.add(calendar.getTime());

        // Create a map to associate dates with events
        HashMap<Date, String> eventMap = new HashMap<>();
        eventMap.put(dateList.get(0), "Christmas");
        eventMap.put(dateList.get(1), "Boxing Day");
        eventMap.put(dateList.get(2), "Day after Boxing Day");

        // Truncate the date to remove milliseconds using DateUtils.truncate
        /* read */ Date truncatedDate = DateUtils.truncate(date, DateUtils.SECOND);

        // Print the truncated date and its associated event
        System.out.println("Truncated Date: " + truncatedDate + " Event: " + eventMap.get(truncatedDate));

        // Iterate over all dates and print their associated events
        for (Date d : dateList) {
            System.out.println("Date: " + d + " Event: " + eventMap.get(d));
        }
    }
}