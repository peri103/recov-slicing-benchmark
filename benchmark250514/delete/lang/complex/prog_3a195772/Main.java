import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Additional code using Calendar to manipulate dates
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date tenDaysLater = calendar.getTime();
        
        // Using ArrayList to store dates
        List<Date> dateList = new ArrayList<>();
        dateList.add(currentDate);
        dateList.add(tenDaysLater);
        
        // Iterating over dateList to print dates
        for (Date date : dateList) {
            System.out.println(date);
        }
        
        /* write */ Date modifiedDate = DateUtils.addMonths(currentDate, 1);
        
        // More complex date manipulation using DateUtils
        Date roundedDate = DateUtils.round(modifiedDate, Calendar.DAY_OF_MONTH);
        Date ceilingDate = DateUtils.ceiling(modifiedDate, Calendar.DAY_OF_MONTH);
        
        System.out.println("Rounded Date: " + roundedDate);
        System.out.println("Ceiling Date: " + ceilingDate);
        
        // Adding the modified date to the list
        dateList.add(modifiedDate);
        
        // Performing operations on the list
        for (int i = 0; i < dateList.size(); i++) {
            Date date = dateList.get(i);
            System.out.println("Date at index " + i + ": " + date);
        }
        
        /* read */ Date truncatedDate = DateUtils.truncate(modifiedDate, DateUtils.MONTH);
        
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Further operations with other dates
        Date nextMonthDate = DateUtils.addMonths(currentDate, 2);
        dateList.add(nextMonthDate);
        
        for (Date date : dateList) {
            System.out.println("Final Date List: " + date);
        }
    }
}