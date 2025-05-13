import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        
        Date date = calendar.getTime();
        
        // Use DateUtils to set weeks
        /* write */ date = DateUtils.setWeeks(date, 2);
        
        // Create a list of dates
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(date);
        
        // Add more dates to the list
        for (int i = 0; i < 5; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, i);
            dateList.add(calendar.getTime());
        }
        
        // Format and print all dates in the list
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Date d : dateList) {
            System.out.println("Date in list: " + sdf.format(d));
        }
        
        // Use DateUtils to truncate to the start of the week
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.WEEK_OF_YEAR);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + sdf.format(truncatedDate));
        
        // Additional complex logic: Calculate the difference in days between the original and truncated date
        long diffInMillis = Math.abs(truncatedDate.getTime() - date.getTime());
        long diffInDays = diffInMillis / (24 * 60 * 60 * 1000);
        System.out.println("Difference in days: " + diffInDays);
        
        // Perform some operations on the list
        for (int i = 0; i < dateList.size(); i++) {
            calendar.setTime(dateList.get(i));
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
                System.out.println("Found a Monday: " + sdf.format(dateList.get(i)));
            }
        }
    }
}