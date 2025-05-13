import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object with the current date
        Date currentDate = new Date();
        
        // Create a calendar instance and set it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        
        // Additional code to demonstrate complex operations
        ArrayList<Date> dateList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            calendar.set(Calendar.DATE, i + 1);
            dateList.add(calendar.getTime());
        }
        
        // Set the weeks of the calendar to a specific value
        /* write */ Date newDate = DateUtils.setWeeks(calendar.getTime(), 10);
        
        // Perform operations on the date list
        for (Date date : dateList) {
            Date truncatedDateInLoop = DateUtils.truncate(date, Calendar.DATE);
            System.out.println("Truncated Date in Loop: " + truncatedDateInLoop);
        }
        
        // Truncate the date to the nearest day
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DATE);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // More complex logic
        ArrayList<Integer> weekNumbers = new ArrayList<>();
        for (Date date : dateList) {
            Calendar tempCal = Calendar.getInstance();
            tempCal.setTime(date);
            weekNumbers.add(tempCal.get(Calendar.WEEK_OF_YEAR));
        }
        
        for (int week : weekNumbers) {
            System.out.println("Week Number: " + week);
        }
    }
}