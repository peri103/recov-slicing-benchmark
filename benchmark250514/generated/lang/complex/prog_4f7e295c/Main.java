import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();
        
        // Format the current date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Date: " + formatter.format(date));
        
        // Create a list to store dates
        ArrayList<Date> dateList = new ArrayList<>();
        
        // Round the date to the nearest hour
        /* write */ Date roundedDate = DateUtils.round(date, Calendar.HOUR);
        
        // Add rounded date to the list
        dateList.add(roundedDate);
        
        // Perform some operations on the list
        for (int i = 0; i < 5; i++) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_MONTH, i);
            dateList.add(cal.getTime());
        }
        
        // Print all dates in the list
        for (Date d : dateList) {
            System.out.println("List Date: " + formatter.format(d));
        }
        
        // Truncate the rounded date to the hour
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + formatter.format(truncatedDate));
        
        // Create another list for storing truncated dates
        ArrayList<Date> truncatedDateList = new ArrayList<>();
        
        // Add the truncated date to the new list
        truncatedDateList.add(truncatedDate);
        
        // Add more truncated dates to the list
        for (Date d : dateList) {
            Date truncated = DateUtils.truncate(d, Calendar.HOUR);
            truncatedDateList.add(truncated);
        }
        
        // Print all truncated dates in the list
        for (Date td : truncatedDateList) {
            System.out.println("Truncated List Date: " + formatter.format(td));
        }
    }
}