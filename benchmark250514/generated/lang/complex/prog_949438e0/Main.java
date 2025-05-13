import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the current date
        Date currentDate = new Date();
        
        // Add 2 weeks to the current date
        /* write */ Date newDate = DateUtils.addWeeks(currentDate, 2);
        
        // Create a list of dates for demonstration
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(currentDate);
        dateList.add(newDate);
        
        // Add more dates to the list
        for (int i = 1; i <= 3; i++) {
            Date futureDate = DateUtils.addDays(newDate, i * 7);
            dateList.add(futureDate);
        }
        
        // Print all dates in the list
        for (Date date : dateList) {
            System.out.println("Date in list: " + date);
        }
        
        // Perform some operations on the list
        Date firstDate = dateList.get(0);
        Date lastDate = dateList.get(dateList.size() - 1);
        
        // Calculate the difference in days between the first and last date
        long diffInMillis = lastDate.getTime() - firstDate.getTime();
        long diffInDays = diffInMillis / (24 * 60 * 60 * 1000);
        System.out.println("Difference in days: " + diffInDays);
        
        // Truncate the date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DATE);
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("Date after adding 2 weeks: " + newDate);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}