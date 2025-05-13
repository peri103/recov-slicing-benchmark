import org.apache.commons.lang3.time.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a Calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        Date date = calendar.getTime();
        
        // Create a list to store manipulated dates
        List<Date> dateList = new ArrayList<>();
        
        // Add the original date to the list
        dateList.add(date);
        
        // Perform some unrelated date manipulations
        Date datePlusDays = DateUtils.addDays(date, 5);
        Date datePlusMonths = DateUtils.addMonths(date, 2);
        
        // Add manipulated dates to the list
        dateList.add(datePlusDays);
        dateList.add(datePlusMonths);
        
        // More unrelated operations
        for (Date d : dateList) {
            System.out.println("Date in list: " + d);
        }
        
        // Original write operation
        /* write */ Date newDate = DateUtils.setWeeks(date, 10);
        
        // Perform more unrelated operations after writing
        Date datePlusYears = DateUtils.addYears(newDate, 1);
        System.out.println("Date plus one year: " + datePlusYears);
        
        // Truncate the date to the start of the week
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.WEEK_OF_YEAR);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Further unrelated operations
        Date endOfMonthDate = DateUtils.ceiling(datePlusMonths, Calendar.MONTH);
        System.out.println("End of month: " + endOfMonthDate);
        
        // Add final manipulated date to the list and print all dates
        dateList.add(endOfMonthDate);
        for (Date d : dateList) {
            System.out.println("Final Date in list: " + d);
        }
    }
}