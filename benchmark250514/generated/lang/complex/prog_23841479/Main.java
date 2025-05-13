import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object with the current date and time
        Date currentDate = new Date();
        
        // Use Calendar to manipulate the date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        
        // Add 5 years to the current date using DateUtils
        /* write */ Date futureDate = DateUtils.addYears(calendar.getTime(), 5);

        // Additional unrelated code to make the program more complex
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(currentDate);

        // Perform some operations on the list
        for (int i = 0; i < 3; i++) {
            calendar.add(Calendar.MONTH, 1);
            dateList.add(calendar.getTime());
        }

        // Print all dates in the list
        for (Date date : dateList) {
            System.out.println("Date in list: " + date);
        }

        // Truncate the future date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, Calendar.DATE);
        
        // Print the truncated date
        System.out.println("Truncated future date: " + truncatedDate);

        // More operations to make the program complex
        Calendar anotherCalendar = Calendar.getInstance();
        anotherCalendar.setTime(truncatedDate);
        anotherCalendar.add(Calendar.DAY_OF_MONTH, 10);
        Date tenDaysLater = anotherCalendar.getTime();
        
        System.out.println("Ten days after truncated date: " + tenDaysLater);
    }
}